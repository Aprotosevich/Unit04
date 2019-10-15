package by.epam.homework.task01.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class State {

    public List<Region> regionsList = new ArrayList<>();

    private String name;
    private long size;
    private City capital;

    public State(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return size == state.size &&
                Objects.equals(regionsList, state.regionsList) &&
                Objects.equals(name, state.name) &&
                Objects.equals(capital, state.capital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionsList, name, size, capital);
    }

    @Override
    public String toString() {
        return "State{" +
                "regionsList=" + regionsList +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", capital=" + capital +
                '}';
    }
}

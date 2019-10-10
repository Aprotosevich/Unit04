package by.epam.homework.task01.entity;

import java.util.ArrayList;
import java.util.List;

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
}

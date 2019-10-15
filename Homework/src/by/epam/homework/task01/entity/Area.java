package by.epam.homework.task01.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Area {

    public List<City> cityList = new ArrayList<>();

    private String name;
    private long size;

    public Area(String name) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Area area = (Area) o;
        return size == area.size &&
                Objects.equals(cityList, area.cityList) &&
                Objects.equals(name, area.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityList, name, size);
    }

    @Override
    public String toString() {
        return "Area{" +
                "cityList=" + cityList +
                ", name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}

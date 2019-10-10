package by.epam.homework.task01.entity;

import java.util.ArrayList;
import java.util.List;

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

}

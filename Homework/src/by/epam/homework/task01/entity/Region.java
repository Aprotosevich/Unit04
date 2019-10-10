package by.epam.homework.task01.entity;

import java.util.ArrayList;
import java.util.List;

public class Region {

    public List<Area> areaList = new ArrayList<>();

    private String name;
    private long size;

    public Region(String name) {
        this.name = name;
    }

    public List<Area> getAreaList() {
        return areaList;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

}

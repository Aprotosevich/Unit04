package by.epam.homework.task01.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Region {

    public List<Area> areaList = new ArrayList<>();
    public City regionCenter;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return size == region.size &&
                Objects.equals(areaList, region.areaList) &&
                Objects.equals(regionCenter, region.regionCenter) &&
                Objects.equals(name, region.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaList, regionCenter, name, size);
    }

    @Override
    public String toString() {
        return "Region{" +
                "areaList=" + areaList +
                ", regionCenter=" + regionCenter +
                ", name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}

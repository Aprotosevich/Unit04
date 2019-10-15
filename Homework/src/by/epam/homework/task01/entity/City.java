package by.epam.homework.task01.entity;

import java.util.Objects;

public class City {

    private String name;
    private boolean isCapital;
    private long size;
    private boolean isRegionCenter;

    public City(String name, long areaSize) {
        this.name = name;
        this.size = areaSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public boolean isRegionCenter() {
        return isRegionCenter;
    }

    public void setRegionCenter(boolean regionCenter) {
        isRegionCenter = regionCenter;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", isCapital=" + isCapital +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return isCapital == city.isCapital &&
                size == city.size &&
                isRegionCenter == city.isRegionCenter &&
                Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isCapital, size, isRegionCenter);
    }
}

package by.epam.homework.task01.entity;

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
}

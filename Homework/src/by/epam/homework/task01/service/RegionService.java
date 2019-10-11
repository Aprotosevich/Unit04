package by.epam.homework.task01.service;

import by.epam.homework.task01.entity.Area;
import by.epam.homework.task01.entity.City;
import by.epam.homework.task01.entity.Region;

import java.util.NoSuchElementException;

public class RegionService {

    public void addArea(Region region, Area area) {
        region.areaList.add(area);
        region.setSize(region.getSize() + area.getSize());
    }

    public long takeRegionSize(Region region) {
        return region.areaList
                .stream()
                .mapToLong(n -> n.getSize())
                .sum();
    }

    public void installSize(Region region) {
        AreaService areaService = new AreaService();
        for (Area element: region.areaList) {
            areaService.installSize(element);
        }

        region.setSize(takeRegionSize(region));
    }

    public void installRegionCenter(Region region, String name) {
        region.regionCenter = findCityByName(region, name);
        findCityByName(region, name).setRegionCenter(true);
    }

    public City findCityByName(Region region, String name) {
        try {
            return region.areaList
                    .stream()
                    .flatMap(area -> area.cityList
                            .stream().filter(city -> city.getName().equals(name)))
                    .findAny()
                    .get();
        } catch (NoSuchElementException e) {
            return null;
        }
    }

}

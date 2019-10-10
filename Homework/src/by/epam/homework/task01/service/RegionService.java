package by.epam.homework.task01.service;

import by.epam.homework.task01.entity.Area;
import by.epam.homework.task01.entity.Region;

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

}

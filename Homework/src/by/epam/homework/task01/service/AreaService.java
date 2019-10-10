package by.epam.homework.task01.service;

import by.epam.homework.task01.entity.Area;
import by.epam.homework.task01.entity.City;

public class AreaService {

    public void addCity(Area area, City city) {
        area.cityList.add(city);
        area.setSize(area.getSize() + city.getSize());
    }

    public long takeSizeFromCities(Area area) {
        return area.cityList
                .stream()
                .mapToLong(n -> n.getSize())
                .sum();
    }

    public void installSize(Area area) {
        area.setSize(takeSizeFromCities(area));
    }

}

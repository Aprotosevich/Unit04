package by.epam.homework.task01.service;

import by.epam.homework.task01.entity.City;
import by.epam.homework.task01.entity.Region;
import by.epam.homework.task01.entity.State;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class StateService {

    private static Logger logger = Logger.getLogger("StateService logger");

    public void addRegion(State state, Region region) {
        state.regionsList.add(region);
        state.setSize(state.getSize() + region.getSize());
    }

    public void installSize(State state) {
        RegionService regionService = new RegionService();
        for (Region element: state.regionsList) {
            regionService.installSize(element);
        }
        state.setSize(takeStateSize(state));
    }

    public long takeStateSize(State state) {
        return state.regionsList
                .stream()
                .mapToLong(n -> n.getSize())
                .sum();
    }

    public void installCapitalByName (State state, String capitalName) {
        City city = takeCityByName(state, capitalName);
        if (city != null) {
            state.setCapital(takeCityByName(state, capitalName));
            takeCityByName(state, capitalName).setCapital(true);
        }
    }

    public City takeCityByName(State state, String name) {
        try {
            return state.regionsList
                    .stream()
                    .flatMap(region -> region.areaList
                            .stream()
                            .flatMap(area -> area.cityList
                                    .stream()
                                    .filter(city -> city.getName().equals(name))))
                    .findAny()
                    .get();
        } catch (NoSuchElementException e) {
            logger.warning("Wrong input! No such city found!");
            return null;
        }
    }

    public List<City> takeRegionCenters(State state) {
        return state.regionsList
                .stream()
                .map(region -> region.regionCenter)
                .collect(Collectors.toList());
    }


}

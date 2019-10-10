package by.epam.homework.task01.service;

import by.epam.homework.task01.entity.City;
import by.epam.homework.task01.entity.Region;
import by.epam.homework.task01.entity.State;

import java.util.Optional;

public class StateService {

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

    }

    public City findCityByName(State state, String name) {
        return (City) state.regionsList.stream()
                .map(n -> n.areaList.stream()
                        .map(t -> t.cityList.stream()
                                .filter(city -> city.getName().equals(name)))).findAny().get();
    }

}

package by.epam.homework.task01;

/* Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль столицу,
        количество областей, площадь, областные центры.

         State > Region > Area > City  */

import by.epam.homework.task01.entity.Area;
import by.epam.homework.task01.entity.City;
import by.epam.homework.task01.entity.Region;
import by.epam.homework.task01.entity.State;
import by.epam.homework.task01.service.AreaService;
import by.epam.homework.task01.service.RegionService;
import by.epam.homework.task01.service.StateService;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        State belarus = main.createBelarusCountry();
        StateService stateService = new StateService();
        System.out.println(belarus.getName());

        System.out.println(belarus.getSize()); // площадь

        System.out.println(stateService.findCityByName(belarus,"Minsk"));// столицу


    }

    private State createBelarusCountry() {
        State state = new State("Belarus");
        Region region = new Region("Minskaya");
        Region region1 = new Region("Grodnenskaya");
        Region region2 = new Region("Vitebskaya");

        StateService stateService = new StateService();
        stateService.addRegion(state, region);
        stateService.addRegion(state, region1);
        stateService.addRegion(state, region2);

        Area area = new Area("Mozirskaya");
        Area area1 = new Area("Zlobinskaya");
        Area area2 = new Area("Soligorskaya");
        Area area3 = new Area("Svetlogorskaya");
        Area area4 = new Area("Volkovisskaya");
        Area area5 = new Area("Minskaya");

        RegionService regionService = new RegionService();
        regionService.addArea(region, area);
        regionService.addArea(region1, area1);
        regionService.addArea(region2, area2);
        regionService.addArea(region, area3);
        regionService.addArea(region1, area4);
        regionService.addArea(region, area5);

        AreaService areaService = new AreaService();
        areaService.addCity(area, new City("Mozir", 150));
        areaService.addCity(area1, new City("Zlobin", 500));
        areaService.addCity(area2, new City("Soligorsk", 350));
        areaService.addCity(area3, new City("Svetlogorsk", 200));
        areaService.addCity(area4, new City("Volkovisk", 200));
        areaService.addCity(area5, new City("Minsk", 450)); // size must be == 1850

        stateService.installSize(state);

        return state;
    }
}

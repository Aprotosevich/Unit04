package by.epam.homework.task04;

/* Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
        (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность
        выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок. */

import by.epam.homework.task04.entity.Country;
import by.epam.homework.task04.entity.Tour;
import by.epam.homework.task04.entity.TourType;
import by.epam.homework.task04.entity.Transport;
import by.epam.homework.task04.service.TourService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        List<Tour> testTours = main.createToursList();
        TourService tourService = new TourService();

        System.out.println(tourService.takeToursByDiffReq
                (TourType.RELAX, Transport.PLAIN, 5, 1700L, testTours));

    }

    private List<Tour> createToursList(){
        List<Tour> list = new ArrayList<>();
        list.add(new Tour(Country.EGYPT, TourType.CRUISE, Transport.BUS,
                true, 5, 500L));
        list.add(new Tour(Country.THAILAND, TourType.RELAX, Transport.PLAIN,
                false, 14, 1750L));
        list.add(new Tour(Country.VIETMAN, TourType.EXCURSION, Transport.PLAIN,
                false, 15, 1950L));
        list.add(new Tour(Country.TURKEY, TourType.CRUISE, Transport.TRAIN,
                true, 7, 740L));
        list.add(new Tour(Country.ITALY, TourType.CRUISE, Transport.SELF,
                false, 10, 1000L));
        list.add(new Tour(Country.USA, TourType.EXCURSION, Transport.PLAIN,
                false, 15, 1400L));
        list.add(new Tour(Country.THAILAND, TourType.RELAX, Transport.PLAIN,
                true, 7, 1500L));
        list.add(new Tour(Country.TURKEY, TourType.RELAX, Transport.PLAIN,
                false, 12, 1100L));
        list.add(new Tour(Country.SPAIN, TourType.SHOPPING, Transport.BUS,
                false, 4, 500));
        list.add(new Tour(Country.ITALY, TourType.SHOPPING, Transport.SELF,
                false, 2, 400L));
        return list;
    }
}

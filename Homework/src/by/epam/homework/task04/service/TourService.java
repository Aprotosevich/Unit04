package by.epam.homework.task04.service;

/* Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
        (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность
        выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок. */

import by.epam.homework.task04.entity.Tour;
import by.epam.homework.task04.entity.TourType;
import by.epam.homework.task04.entity.Transport;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TourService {

    public List<Tour> takeToursByDiffReq
            (TourType tourType, Transport transport, int daysMin, long priceMax, List<Tour> tourList) {
        return tourList.stream()
                .filter(tour -> {
                    return tour.getTourType() == tourType &&
                            tour.getTransport() == transport &&
                            tour.getDaysStayed() >= daysMin &&
                            tour.getPrice() <= priceMax;
                })
                .collect(Collectors.toList());
    }

    public List<Tour> takeToursByType(TourType tourType, List<Tour> toursList){
        return toursList.stream()
                .filter(tour -> tour.getTourType() == tourType)
                .collect(Collectors.toList());
    }

    public List<Tour> takeToursByDaysStayed(int daysMin, int daysMax, List<Tour> tourList) {
        return tourList.stream()
                .filter(tour
                        -> tour.getDaysStayed() >= daysMin && tour.getDaysStayed() <= daysMax)
                .collect(Collectors.toList());
    }

    public List<Tour> takeToursByTransport(Transport transport, List<Tour> tourList) {
        return tourList.stream()
                .filter(tour -> tour.getTransport() == transport)
                .collect(Collectors.toList());
    }

    public List<Tour> takeToursByFood(boolean foodIncluded, List<Tour> tourList) {
        return tourList.stream()
                .filter(tour -> tour.isFoodIncluded() == foodIncluded)
                .collect(Collectors.toList());
    }

    public List<Tour> takeSortedToursByPrice(List<Tour> tourList) {
        return tourList.stream()
                .sorted(Comparator.comparing(Tour::getPrice))
                .collect(Collectors.toList());
    }

}

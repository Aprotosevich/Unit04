package by.epam.homework.task04.entity;

public class MedicTour extends AbstractTour {

    public MedicTour (Country country, Transport transport, int daysStayed, boolean isFoodIncluded) {
        this.country = country;
        this.transport = transport;
        this.daysStayed = daysStayed;
        this.isFoodIncluded = isFoodIncluded;
    }

}

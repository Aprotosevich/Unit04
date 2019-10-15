package by.epam.homework.task04.entity;

public class ExcursionTour extends AbstractTour {

    public ExcursionTour(Country country, Transport transport, int daysStayed, boolean isFoodInclubed) {
        this.country = country;
        this.transport = transport;
        this.daysStayed = daysStayed;
        this.isFoodIncluded = isFoodInclubed;
    }

}

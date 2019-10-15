package by.epam.homework.task04.entity;

public class RelaxTour extends AbstractTour {

    private boolean isAlcocholIncluded;

    public RelaxTour (Country country, Transport transport, int daysStayed,
                      boolean isFoodIncluded, boolean isAlcocholIncluded) {
        this.country = country;
        this.transport = transport;
        this.daysStayed = daysStayed;
        this.isFoodIncluded = isFoodIncluded;
        this.isAlcocholIncluded = isAlcocholIncluded;
    }


}

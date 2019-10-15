package by.epam.homework.task04.entity;

import java.util.Objects;

public class Tour {

    private Country country;
    private TourType tourType;
    private Transport transport;

    private boolean foodIncluded;
    private int daysStayed;
    private long price;

    public Tour(){}

    public Tour(Country country, TourType tourType, Transport transport, boolean foodIncluded,
                int daysStayed, long price) {
        this.country = country;
        this.tourType = tourType;
        this.transport = transport;
        this.foodIncluded = foodIncluded;
        this.daysStayed = daysStayed;
        this.price = price;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public TourType getTourType() {
        return tourType;
    }

    public void setTourType(TourType tourType) {
        this.tourType = tourType;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public boolean isFoodIncluded() {
        return foodIncluded;
    }

    public void setFoodIncluded(boolean foodIncluded) {
        this.foodIncluded = foodIncluded;
    }

    public int getDaysStayed() {
        return daysStayed;
    }

    public void setDaysStayed(int daysStayed) {
        this.daysStayed = daysStayed;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "country=" + country +
                ", tourType=" + tourType +
                ", transport=" + transport +
                ", foodIncluded=" + foodIncluded +
                ", daysStayed=" + daysStayed +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return foodIncluded == tour.foodIncluded &&
                daysStayed == tour.daysStayed &&
                price == tour.price &&
                country == tour.country &&
                tourType == tour.tourType &&
                transport == tour.transport;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, tourType, transport, foodIncluded, daysStayed, price);
    }
}

package com.kodilla.collections.adv.exercises.homework;

import java.util.Objects;

public class Flight {
    private City departure;
    private City arrival;

    public Flight(City departure, City arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public City getDeparture() {
        return departure;
    }

    public City getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return departure == flight.departure && arrival == flight.arrival;
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, arrival);
    }
}

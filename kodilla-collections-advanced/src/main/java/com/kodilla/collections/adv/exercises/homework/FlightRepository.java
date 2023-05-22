package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    private static List<Flight> flights;

    static {
        flights = new ArrayList<>();
        flights.add(new Flight(City.LODZ, City.WARSZAWA));
        flights.add(new Flight(City.WARSZAWA, City.GDANSK));
        flights.add(new Flight(City.GDANSK, City.POZNAN));
        flights.add(new Flight(City.WARSZAWA, City.LODZ));
        flights.add(new Flight(City.LODZ, City.GDANSK));
}
    public static List<Flight> getFlightsTable() {
        return flights;
    }
}


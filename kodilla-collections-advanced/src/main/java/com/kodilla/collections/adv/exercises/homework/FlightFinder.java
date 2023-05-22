package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {


    public List<Flight> findFlightsFrom(City departure) {
        List<Flight> foundFlights = new ArrayList<>();

        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getDeparture().equals(departure)) {
                foundFlights.add(flight);
            }
        }

        return foundFlights;
    }

    public List<Flight> findFlightsTo(City arrival) {
        List<Flight> foundFlights = new ArrayList<>();

        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getArrival().equals(arrival)) {
                foundFlights.add(flight);
            }
        }

        return foundFlights;
    }


}


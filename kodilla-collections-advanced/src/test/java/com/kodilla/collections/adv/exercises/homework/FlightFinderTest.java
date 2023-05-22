package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class FlightFinderTest {

    @Test
            public void testFindFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightsFromWarsaw = flightFinder.findFlightsFrom(City.WARSZAWA);

        Assertions.assertEquals(2, flightsFromWarsaw.size());
        Assertions.assertEquals(new Flight(City.WARSZAWA, City.GDANSK), flightsFromWarsaw.get(0));
        Assertions.assertEquals(new Flight(City.WARSZAWA, City.LODZ), flightsFromWarsaw.get(1));
    }

    @Test
    public void testFindFlightsTo() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightsToGdansk = flightFinder.findFlightsTo(City.GDANSK);

        Assertions.assertEquals(2, flightsToGdansk.size());
        Assertions.assertEquals(new Flight(City.WARSZAWA, City.GDANSK), flightsToGdansk.get(0));
        Assertions.assertEquals(new Flight(City.LODZ, City.GDANSK), flightsToGdansk.get(1));
    }
}
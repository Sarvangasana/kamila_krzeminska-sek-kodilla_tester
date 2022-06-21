package com.kodilla.collections.adv.excercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    @Test
    public void testFindFlightsFrom() {
        //given
        //when
        List<Flight> result = FlightFinder.findFlightsFrom("London");
        //then
        List<Flight> expectedList = new ArrayList<Flight>();
        expectedList.add(new Flight("London",  "New York"));
        expectedList.add(new Flight("London",  "Tel Aviv"));
        expectedList.add(new Flight("London",  "Moscow"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsTo() {
        //given
        //when
        List<Flight> result = FlightFinder.findFlightsTo("Tel Aviv");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("London",  "Tel Aviv"));
        assertEquals(expectedList, result);
    }
}

package com.kodilla.collections.adv.excercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {

        @Test
        public void testFindFlightsFrom() {
            //given
            List<Flight> testFlights = new ArrayList<>();
                    testFlights.add(new Flight("Katowice", "Lizbona"));
                    testFlights.add(new Flight("Katowice", "Kijów"));
                    testFlights.add(new Flight("Kijów", "Katowice"));
            //when
            List<Flight> result = FlightFinder.findFlightsFrom("Katowice");
            //then
            List<Flight> expectedList = new ArrayList<>();
            expectedList.add(new Flight("Katowice", "Lizbona"));
            expectedList.add(new Flight("Katowice", "Kijów"));
            assertEquals(expectedList, result);
        }
}

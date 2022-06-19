package com.kodilla.collections.adv.excercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
  public static List<Flight> findFlightsFrom(String departure) {
      FlightRepository.getFlightsTable();
      List<Flight> result = new ArrayList<>();
      for (Flight flight : FlightRepository.getFlightsTable())
          if (flight.getDeparture().equals(departure))
              result.add(flight);
      return result;
    }

    public static List<Flight> findFlightsTo(String arrival) {
      FlightRepository.getFlightsTable();
      List<Flight> result = new ArrayList<>();
      for (Flight flight : FlightRepository.getFlightsTable())
          if (flight.getArrival().equals(arrival))
              result.add(flight);
          return result;
    }
}

package com.kodilla.collections.adv.excercises.homework;

import java.util.*;

public class FlightRepository {
    private static List<Flight> flights = new ArrayList<>();

    public static List<Flight> getFlightsTable() {
        // nie można wywołać metody (tu np. add() - bez umieszczenia w innej metodzie, choćby "main"
        if (flights.isEmpty()) { // musi by warunek spr czy lista jest pusta, bo potem przy każdym wywołaniu metody będzie dodawał te same elementy do już istniejącej listy
            flights.add(new Flight("London",  "New York"));
            flights.add(new Flight("London",  "Tel Aviv"));
            flights.add(new Flight("London",  "Moscow"));
            flights.add(new Flight("Warsaw",  "New York"));
            flights.add(new Flight("Warsaw",  "Moscow"));
            flights.add(new Flight("Warsaw", "London"));
        }
        return flights;
    }

    public int size() {
        return flights.size();
    }
}

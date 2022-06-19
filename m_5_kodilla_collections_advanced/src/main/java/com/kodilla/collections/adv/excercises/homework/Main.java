package com.kodilla.collections.adv.excercises.homework;

public class Main {
    public static void main(String[] args) {
        System.out.println(FlightFinder.findFlightsFrom("London"));
        System.out.println(FlightFinder.findFlightsTo("Tel Aviv"));

        System.out.println(FlightRepository.getFlightsTable());
    }
}

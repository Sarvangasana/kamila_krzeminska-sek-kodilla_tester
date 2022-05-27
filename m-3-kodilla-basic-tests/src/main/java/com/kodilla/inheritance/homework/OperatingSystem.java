package com.kodilla.inheritance.homework;

public class OperatingSystem {
    static int publishmentYear = 2016;

    public OperatingSystem(int publishmentYear) {
        this.publishmentYear = publishmentYear;
    }

    static public void turnOn() {
        System.out.println("Turn on.");
    }

    static public void turnOff() {
        System.out.println("Turn off.");
    }

    static public int getPublishmentYear() {
        return publishmentYear;
    }
}

package com.kodilla.inheritance.homework;

public class OperatingSysApplication {
    public static void main(String[] args) {
        OperatingSystem.turnOn();
        OperatingSystem.turnOff();

        OperatingSystemExtension.turnOn();
        OperatingSystemExtension.turnOff();

        OperatingSystemExtension2.turnOn();
        OperatingSystemExtension2.turnOff();

        System.out.println(OperatingSystem.getPublishmentYear());
    }
}

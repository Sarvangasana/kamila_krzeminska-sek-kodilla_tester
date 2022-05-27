package com.kodilla.inheritance.homework;

public class OperatingSystemExtension2 extends OperatingSystemExtension {
    int modificationYear = 2018;

    public OperatingSystemExtension2 (int modificationYear, int publishmentYear, int marketWithdrawalYear) {
        super(publishmentYear, marketWithdrawalYear);
        this.modificationYear = modificationYear;
    }

    static public void turnOn() {
        System.out.println("Turn on and go ahead.");
    }

    static public void turnOff() {
        System.out.println("Turn off and go ahead.");
    }

}

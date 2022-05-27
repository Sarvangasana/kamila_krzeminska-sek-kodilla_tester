package com.kodilla.inheritance.homework;

public class OperatingSystemExtension extends OperatingSystem {
        int marketWithdrawalYear = 2022;

        public OperatingSystemExtension(int publishmentYear, int marketWithdrawalYear) {
            super(publishmentYear);
            this.marketWithdrawalYear = marketWithdrawalYear;
        }

        static public void turnOn() {
            System.out.println("Turn the system on.");
        }

        static public void turnOff() {
            System.out.println("Turn the system off.");
        }
}

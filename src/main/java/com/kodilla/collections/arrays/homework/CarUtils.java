package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.*;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("The car brand: " + getCarBrand(car));
        System.out.println("Max speed: " + getMaxSpeed(car));
        car.randomlyIncreasedSpeed();
        System.out.println("Randomly increased speed: " + car.getSpeed());
    }

    private static String getCarBrand(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Toyota)
            return "Toyota";
        else
            return "Unknown car brand";
    }

    private static int getMaxSpeed(Car car) {
        if (car instanceof Ford)
            return 120;
        else if (car instanceof Opel)
            return 140;
        else if (car instanceof Toyota)
            return 150;
        else
            return 0;
    }
}


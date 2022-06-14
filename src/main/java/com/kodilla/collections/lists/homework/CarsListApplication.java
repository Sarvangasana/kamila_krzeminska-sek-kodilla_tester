package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Opel opel = new Opel();
        cars.add(new Toyota());
        cars.add(opel);
        cars.add(new Ford());

        for (Car car : cars)
            CarUtils.describeCar(car);

        cars.remove(0);
        cars.remove(opel);
        System.out.println();
        System.out.println();
        System.out.println();

        for (Car car : cars)
            CarUtils.describeCar(car);
            System.out.println(cars.size());
    }
}


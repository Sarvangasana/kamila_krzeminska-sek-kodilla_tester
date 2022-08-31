package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class CarFactoryTestSuite {

    @Test
    public void shouldCreateRandomCarAccordingToSeasons() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("selectCarAccordingToSeasons");
        //When
        String typeOfCar = car.getCarType();
        boolean isLightsOn = car.hasHeadlightsTurnedOn();
        System.out.println(typeOfCar);
        System.out.println(isLightsOn);
        //Then
        List<String> possibleCarTypes = Arrays.asList("Cabrio", "Suv", "Sedan");
        Assertions.assertTrue(possibleCarTypes.contains(typeOfCar));
    }
}

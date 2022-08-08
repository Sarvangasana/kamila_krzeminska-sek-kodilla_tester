package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Component
@Scope("prototype")
public class Clock {

    public Clock() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.now();
        System.out.println(dtf.format(localTime));
    }

    public static void main(String[] args) {
        Clock clock = new Clock();
        System.out.println(clock);
    }
}
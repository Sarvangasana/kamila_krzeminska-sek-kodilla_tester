package com.kodilla.spring.basic.spring_scopes;

import com.kodilla.spring.basic.spring_configuration.homework.Clock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClockTestSuite {

    @Test
    public void shouldCreateDifferentClockTimeObjects() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstClockTime = context.getBean(Clock.class);
        Clock secondClockTime = context.getBean(Clock.class);
        Clock thirdClockTime = context.getBean(Clock.class);
        Assertions.assertNotEquals(firstClockTime, secondClockTime);
        Assertions.assertNotEquals(secondClockTime, thirdClockTime);
        Assertions.assertNotEquals(firstClockTime, thirdClockTime);
    }
}
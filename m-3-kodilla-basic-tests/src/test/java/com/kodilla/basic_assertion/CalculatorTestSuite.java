package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        double a = 5.657;
        double b = 5.4;
        double subtractResult = calculator.subtract(a, b);
        assertEquals(0.257, subtractResult, 0.001);
    }

    @Test
    public void testPowerForPlusTwoAndAHalf() {
        Calculator calculator = new Calculator();
        double a = 2.5;
        int n = 2;
        double powerResult = calculator.power(a, n);
        assertEquals(6.25, powerResult, 0.01);
    }

    @Test
    public void testPowerForMinusOneAndAHalf() {
        Calculator calculator = new Calculator();
        double a = -1.5;
        int n = 2;
        double powerResult = calculator.power(a, n);
        assertEquals(2.25, powerResult, 0.01);
    }

    @Test
    public void testPowerForZero() {
        Calculator calculator = new Calculator();
        double a = 0;
        int n = 2;
        double powerResult = calculator.power(a, n);
        assertEquals(0, powerResult, 0.01);
    }
}

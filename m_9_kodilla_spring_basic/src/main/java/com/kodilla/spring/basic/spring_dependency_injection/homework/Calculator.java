package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        display.display(a);
        display.display(b);
        display.display(a + b);
        return a + b;
    }

    public double subtract(double a, double b) {
        display.display(a);
        display.display(b);
        display.display(a - b);
        return a - b;
    }

    public double multiply(double a, double b) {
        display.display(a);
        display.display(b);
        double result = a * b;
        if (result == -0) {
            result = Math.abs(result);
        }
        display.display(result);
        return result;
    }

    public double divide(double a, double b) {
        display.display(a);
        display.display(b);
        double result = a / b;

        if (b == 0) {
            System.out.println("You cannot divide by zero.");
        }

        if (result == -0) {
            result = Math.abs(result);
        }

        if (b != 0) {
            display.display(result);
        }
        return result;
    }
}

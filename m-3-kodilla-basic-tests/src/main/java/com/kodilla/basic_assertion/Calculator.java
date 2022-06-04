package com.kodilla.basic_assertion;

public class Calculator {
    double n;

    public double power(double a, int n) {
        double power = 1;
        this.n = n;
        double tmp = n;
        while (tmp > 0) {
            power *= a;
            tmp--;
        }
        return power;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double squaredMultiplication(double a) {
        return a * a;
    }
}

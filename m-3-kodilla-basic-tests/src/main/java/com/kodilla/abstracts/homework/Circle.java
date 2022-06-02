package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    private int r;
    static final double PI = 3.14;

    public Circle(int r) {
        super();
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return PI * r * r;
    }

    @Override
    public double calculateCircuit() {
        return 2 * PI * r;
    }
}

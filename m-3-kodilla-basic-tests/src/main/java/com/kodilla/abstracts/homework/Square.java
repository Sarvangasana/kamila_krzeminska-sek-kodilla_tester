package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private int a;

    public Square(int a) {
        super();
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return a * a;
    }

    @Override
    public double calculateCircuit() {
        return 4 * a;
    }
}

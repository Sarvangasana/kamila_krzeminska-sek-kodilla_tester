package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square.calculateArea());
        System.out.println(square.calculateCircuit());

        Rectangle rectangle = new Rectangle(4, 3);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculateCircuit());

        Circle circle = new Circle(2);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateCircuit());
    }
}

package com.kodilla.collections.interfaces;

import java.util.Objects;

public class Triangle implements Shape {
    double width;
    double hight;
    double hypotenuse;

    public Triangle(double width, double hight, double hypotenuse) {
        this.width = width;
        this.hight = hight;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        return width * hight / 2;
    }

    @Override
    public double getPerimeter() {
        return width + hight + hypotenuse;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", hight=" + hight +
                ", hypotenuse=" + hypotenuse +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.width, width) == 0
                && Double.compare(triangle.hight, hight) == 0
                && Double.compare(triangle.hypotenuse, hypotenuse) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, hight, hypotenuse);
    }
}

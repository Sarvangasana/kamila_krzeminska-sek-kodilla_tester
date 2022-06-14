package com.kodilla.collections.interfaces.homework;

import java.util.Objects;
import java.util.Random;

public class Opel implements Car{
    private int speed;

    @Override
    public int getSpeed() {
        return speed;
    }
    @Override
    public void increaseSpeed() {
        speed += 2;
    }

    @Override
    public void decreaseSpeed() {
        speed--;
    }

    @Override
    public void randomlyIncreasedSpeed() {
        Random random = new Random();
        speed += random.nextInt(140) + 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opel opel = (Opel) o;
        return speed == opel.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}

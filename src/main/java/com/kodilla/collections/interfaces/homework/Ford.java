package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Ford implements Car {
    private int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 1;
    }

    @Override
    public void decreaseSpeed() {
        speed--;
    }

    @Override
    public void randomlyIncreasedSpeed() {
        Random random = new Random();
        speed += random.nextInt(120) + 1;
    }
}

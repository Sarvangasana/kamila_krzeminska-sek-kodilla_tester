package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{
    private int speed;

    @Override
    public int getSpeed() {
        return speed;
    }
    @Override
    public void increaseSpeed() {
        speed++;
    }

    @Override
    public void decreaseSpeed() {
        speed--;
    }
}

package com.kodilla.collections.interfaces.homework;

public class Skoda implements Car{
    private int speed;

    public Skoda(int Speed){
        this.speed = Speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {
        speed = speed + 20;
        return speed;
    }

    @Override
    public int decreaseSpeed() {
        speed = speed - 10;
        return speed;
    }

    @Override
    public String toString() {
        return "Skoda";
    }
}

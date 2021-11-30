package com.kodilla.collections.interfaces.homework;

public class Volkswagen implements Car {
    private int speed;

    public Volkswagen(int Speed){
        this.speed = Speed;
    }


    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {
        speed = speed + 30;
        return speed;
    }

    @Override
    public int decreaseSpeed() {
        speed = speed - 15;
        return speed;
    }

    @Override
    public String toString() {
        return "Volkswagen";
    }
}

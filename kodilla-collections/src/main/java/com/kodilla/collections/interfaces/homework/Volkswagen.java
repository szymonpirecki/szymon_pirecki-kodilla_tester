package com.kodilla.collections.interfaces.homework;

public class Volkswagen implements Car {
    private int Speed;

    public Volkswagen(int Speed){
        this.Speed = Speed;
    }


    @Override
    public int getSpeed() {
        return Speed;
    }

    @Override
    public int increaseSpeed() {
        Speed = Speed + 30;
        return Speed;
    }

    @Override
    public int decreaseSpeed() {
        Speed = Speed - 15;
        return Speed;
    }
}

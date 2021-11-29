package com.kodilla.collections.interfaces.homework;

public class Skoda implements Car{
    private int Speed;

    public Skoda(int Speed){
        this.Speed = Speed;
    }
    @Override
    public int getSpeed() {
        return Speed;
    }

    @Override
    public int increaseSpeed() {
        Speed = Speed + 20;
        return Speed;
    }

    @Override
    public int decreaseSpeed() {
        Speed = Speed - 10;
        return Speed;
    }
}

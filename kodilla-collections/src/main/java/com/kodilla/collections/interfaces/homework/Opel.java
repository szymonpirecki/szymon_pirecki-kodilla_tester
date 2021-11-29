package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{
    private int Speed;

    public Opel(int Speed){
        this.Speed = Speed;
    }
    @Override
    public int getSpeed() {
        return Speed;
    }

    @Override
    public int increaseSpeed() {
        Speed = Speed + 25;
        return Speed;
    }

    @Override
    public int decreaseSpeed() {
        Speed = Speed - 10;
        return Speed;
    }


}

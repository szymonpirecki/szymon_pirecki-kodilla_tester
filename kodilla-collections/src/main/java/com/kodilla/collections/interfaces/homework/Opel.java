package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Opel implements Car{
    private int speed;

    public Opel(int Speed){
        this.speed = Speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int increaseSpeed() {
        speed = speed + 25;
        return speed;
    }

    @Override
    public int decreaseSpeed() {
        speed = speed - 10;
        return speed;
    }

    @Override
    public String toString() {
        return "Opel";
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

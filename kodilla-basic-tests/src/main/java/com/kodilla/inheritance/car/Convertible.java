package com.kodilla.inheritance.car;


import com.kodilla.inheritance.car.Car;

public class Convertible extends Car { //convertible dziedziczy publiczne rzeczy po car
private String brand;
    public Convertible(int wheels, int seats, char segment, String brand) {
        super(wheels, seats, segment);
        this.brand = brand;
        System.out.println("Convertible constructor");
    }

    public void openRoof() {
        System.out.println("Opening roof...");
    }

    public void closeRoof() {
        System.out.println("Closing roof...");
    }

    @Override
    public void openDoors(){
        System.out.println("Opening 2 doors");
    }

   // @Override
    //public void turnOnLights() {
      //  super.turnOnLights();
    }

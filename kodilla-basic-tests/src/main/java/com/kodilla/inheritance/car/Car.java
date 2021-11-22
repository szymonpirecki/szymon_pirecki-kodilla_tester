package com.kodilla.inheritance.car;

public class Car {
    private int wheels;
    private int seats;
    private char segment;

    public Car(int wheels, int seats, char segment) {
        this.wheels = wheels;
        this.seats = seats;
        this.segment = segment;
        System.out.println("Car constructor");

    }
    public void turnOnLights(){
        System.out.println("Lights were turned on.");
    }
    public void openDoors(){
        System.out.println("Opening 4 doors");
    }
    public int getWheels(){
        return wheels;
    }
    public int getSeats(){
        return seats;
    }
    public void displayNumberOfSeats(){
        System.out.println("Number of seats: " + seats);
    }
}





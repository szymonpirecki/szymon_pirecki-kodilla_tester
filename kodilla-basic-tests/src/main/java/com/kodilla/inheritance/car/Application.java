package com.kodilla.inheritance.car;

public class Application {

    public static void main(String[] args) {

        Car car = new Car(4, 5, 'B');
        car.turnOnLights();
        car.openDoors();

        Convertible convertible = new Convertible(4,2,'A', "Toyota");
        convertible.turnOnLights();
        convertible.openRoof();
        convertible.closeRoof();

        System.out.println(convertible.getSeats());
        System.out.println(car.getWheels());
        convertible.displayNumberOfSeats();
    }
}
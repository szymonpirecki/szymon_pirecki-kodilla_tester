package com.kodilla.inheritance;

public class Car {
    private int wheels;
    private int seats;

    public void turnOnLights(){
        System.out.println("Lights were turned on.");
    }
}

public class Convertible extends Car { //convertible dziedziczy rzeczy po car

    public void openRoof() {
        System.out.println("Opening roof...");
    }

    public void closeRoof() {
        System.out.println("Closing roof...");
    }
}
/*
Klasa Car dziedziczy wszystko, co jest nieprywatne z klasy Object.
Dalej, klasa Convertible dziedziczy wszystkie nieprywatne elementy z klasy Car, łącznie z odziedziczonymi z klasy Object.
Warto wspomnieć, że w Javie nie można rozszerzać wielu klas jednocześnie – klasa może dziedziczyć tylko po jednej klasie.
 */

public class Application {

    public static void main(String[] args) {

        Car car = new Car;
        car.turnOnLights();

        Convertible convertible = new Convertible();
        convertible.turnOnLights();
    }
}

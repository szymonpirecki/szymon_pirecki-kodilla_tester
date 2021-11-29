package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Skoda;
import com.kodilla.collections.interfaces.homework.Volkswagen;

public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("______________________________");
        System.out.println("Car brand: " + getCarBrand(car));
        System.out.println("Speeding: " + car.increaseSpeed()); //zeby moc to zrobic zmienilem metody increase i decrease z void na zwracajace int
                                                                //mozna to bylo zrobic inaczej?

    }

    public static String getCarBrand(Car car){
        if(car instanceof Volkswagen){
            return "Volkswagen";
        }
        else if(car instanceof Skoda){
            return "Skoda";
        }
        else if(car instanceof Opel){
            return "Opel";
        }
        else{
            return "other car";
        }
    }

    }


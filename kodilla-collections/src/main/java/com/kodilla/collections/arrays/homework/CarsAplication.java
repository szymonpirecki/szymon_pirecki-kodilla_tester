package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Skoda;
import com.kodilla.collections.interfaces.homework.Volkswagen;

import java.util.Random;

public class CarsAplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15 + 1)];
        for(int n = 0; n < cars.length; n++ ){
            cars[n] = drawCar();
        }
        for(Car car : cars){
            CarUtils.describeCar(car);
        }
    }

    private static Car drawCar() {
        Random random = new Random();
        int drawnCarBrand = random.nextInt(3);
        int a = random.nextInt(50);

        if (drawnCarBrand == 0) {
            return new Volkswagen(a);
        } else if (drawnCarBrand == 1) {
            return new Skoda(a);
        } else {
            return new Opel(a);
        }
    }
}




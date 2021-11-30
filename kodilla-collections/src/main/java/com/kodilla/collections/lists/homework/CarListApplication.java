package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Skoda;
import com.kodilla.collections.interfaces.homework.Volkswagen;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.arrays.homework.CarUtils.describeCar;

public class CarListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Volkswagen(100));
        cars.add(new Volkswagen(80));
        cars.add(new Volkswagen(50));
        cars.add(new Skoda(110));
        cars.add(new Skoda(80));
        cars.add(new Skoda(95));
        cars.add(new Opel(90));
        cars.add(new Opel(130));
        Opel corsa = new Opel(70);
        cars.add(corsa);

        cars.remove(0);
        cars.remove(corsa);
        cars.remove(new Opel (90));  // ten sposob nie dzialal nie wiem dlaczego
        System.out.println("W tej kolekcji jest: " + cars.size() + " aut.");

        for(Car car : cars){
            describeCar(car);
        }
    }
}

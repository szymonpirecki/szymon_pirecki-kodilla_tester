package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car passat = new Volkswagen(0);
        Car rapid = new Skoda(0);
        Car signum = new Opel(0);
    doRace(passat);
    doRace(rapid);
    doRace(signum);

    }
    private static void doRace(Car car){
//        car.increaseSpeed();
//        car.increaseSpeed();
//        car.increaseSpeed();
//        car.decreaseSpeed();
//        car.decreaseSpeed();
//        System.out.println(car + " has reached a speed of " + car.getSpeed());
        int i = 0;
                while(i <= 3){
                    car.increaseSpeed();
                    i++;
                }
                int n = 0;
                while(n <= 2){
                    car.decreaseSpeed();
                    n++;
                }
        System.out.println("------------------------------------");
        System.out.println(car + " has reached a speed of " + car.getSpeed());
        System.out.println("------------------------------------");
    }
}

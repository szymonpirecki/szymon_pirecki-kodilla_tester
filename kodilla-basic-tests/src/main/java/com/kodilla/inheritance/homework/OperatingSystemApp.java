package com.kodilla.inheritance.homework;

public class OperatingSystemApp {
    public static void main(String[] args){

        OperatingSystem operatingSystem = new OperatingSystem(2000);
        Windows vista = new Windows(2007);
        MacOs bigSur = new MacOs(2020);

        System.out.println(operatingSystem.getDefinition());
        vista.turnOn();
        vista.update();
        vista.turnOff();
        bigSur.turnOn();
        bigSur.update();
        bigSur.turnOff();

    }
}

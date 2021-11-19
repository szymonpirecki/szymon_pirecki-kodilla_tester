package com.kodilla.inheritance.homework;

public class OperatingSystemApp {
    public static void main(String[] args){

        Windows vista = new Windows(2007);
        MacOs bigSur = new MacOs(2020);

        System.out.println(vista.getDefinition());
        vista.turnOn();
        vista.update();
        vista.turnOff();
        bigSur.turnOn();
        bigSur.update();
        bigSur.turnOff();

    }
}

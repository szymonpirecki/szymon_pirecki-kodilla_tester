package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearOfRelease;  //czy musze uzyc tutaj modyfikatora dostepu?
    private String definition = "System operacyjny (ang. operating system, skrót OS) – oprogramowanie zarządzające systemem komputerowym, tworzące środowisko do uruchamiania i kontroli zadań.";

    public OperatingSystem (int yearOfRelease){
        this.yearOfRelease = yearOfRelease;

    }

    public void turnOn(){
        System.out.println("On");
    }
    public void turnOff(){
        System.out.println("Off");
    }
    public void update(){
        System.out.println("Updating");
    }
    public String getDefinition(){
        return definition;
    }

}

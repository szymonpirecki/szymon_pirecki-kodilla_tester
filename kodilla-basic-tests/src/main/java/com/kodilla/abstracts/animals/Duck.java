package com.kodilla.abstracts.animals;

public class Duck extends Animal {
    String color;
    public Duck(String color) {
        super(2);
        this.color = color;
    }

    @Override
    public void giveVoice() {
        System.out.println(" Kwa kwa");
    }

    @Override
    public void hasATail() {
        System.out.println("Has not a tail");
    }
}

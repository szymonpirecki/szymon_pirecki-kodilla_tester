package com.kodilla.abstracts.animals;

public class Duck extends Animal {
    public Duck() {
        super(2);
    }

    @Override
    public void giveVoice() {
        System.out.println("Kwa kwa");
    }

    @Override
    public void hasATail() {
        System.out.println("Has not a tail");
    }
}

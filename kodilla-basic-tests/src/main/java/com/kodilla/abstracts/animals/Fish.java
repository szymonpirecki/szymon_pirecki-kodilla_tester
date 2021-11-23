package com.kodilla.abstracts.animals;

public class Fish extends Animal{
    String color;

    public Fish(String color){
        super(0);
        this.color = color;

    }

    @Override
    public void giveVoice() {
        System.out.println(" bulbul");
    }

    @Override
    public void hasATail() {
        System.out.println("Has a tail");
    }
}

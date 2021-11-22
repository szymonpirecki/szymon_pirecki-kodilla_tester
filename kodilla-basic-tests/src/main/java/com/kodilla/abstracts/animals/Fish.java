package com.kodilla.abstracts.animals;

public class Fish extends Animal{

    public Fish(){
        super(0);
    }

    @Override
    public void giveVoice() {
        System.out.println("bulbul");
    }

    @Override
    public void hasATail() {
        System.out.println("Has a tail");
    }
}

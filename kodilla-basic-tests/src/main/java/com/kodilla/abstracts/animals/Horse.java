package com.kodilla.abstracts.animals;

public class Horse extends Animal{
String color;
    public Horse(String color){
        super(4);
        this.color = color;
    }

   // public Horse() {
     //   super(4);

   // }

    @Override
    public void giveVoice() {
        System.out.println("Ihaaa");
    }

    @Override
    public void hasATail() {
        System.out.println("Has a tail");

    }
}

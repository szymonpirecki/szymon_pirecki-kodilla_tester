package com.kodilla.abstracts.animals;

public class Dog extends Animal {

    public Dog() {
        super(4);       //w ten sposob kazdy obiekt klasy Dog bedzie mial z automatu 4 nogi
    }

    @Override
    public void giveVoice() {
        System.out.println("Hau hau");
    }

    @Override
    public void hasATail() {
        System.out.println("Has a tail");
    }
    //public void sit(){
      //  System.out.println("sit");
    //}
}

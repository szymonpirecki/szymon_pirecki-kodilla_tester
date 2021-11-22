package com.kodilla.abstracts.animals;

public abstract class Animal {
    private int numberOfLegs;           //zadeklarowana prywatna zmienna

    public Animal(int numberOfLegs)
    {       //konstruktor Animal
        this.numberOfLegs = numberOfLegs;
    } // konstruktor animal

    public int getNumberOfLegs() {       //getter numberOfLegs
        return numberOfLegs;
    }   //getter: number of legs

    public abstract void giveVoice();

    public void sit()
    {
        System.out.println("sit");
    }

    public abstract void hasATail();
}

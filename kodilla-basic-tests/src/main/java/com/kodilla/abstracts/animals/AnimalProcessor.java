package com.kodilla.abstracts.animals;

import com.kodilla.abstracts.animals.Animal;

public class AnimalProcessor {
    public void process(Animal animal){ //metoda przejmuje ogolny typ - kazdy typ ktory dziedziczy po Animal
        System.out.println("This animal has " + animal.getNumberOfLegs() + " legs and says:");
        animal.giveVoice();
    }  // ta metoda ma zostać wywołana z każdego obiektu, który jest podtypem Animal


}

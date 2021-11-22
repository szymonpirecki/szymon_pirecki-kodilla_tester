package com.kodilla.abstracts.animals;

import com.kodilla.abstracts.animals.Animal;
import com.kodilla.abstracts.animals.AnimalProcessor;
import com.kodilla.abstracts.animals.Dog;
import com.kodilla.abstracts.animals.Duck;

public class Application {
    public static void main(String[] args) {
/*
        Dog dog = new Dog();
        dog.giveVoice();

        Duck duck = new Duck();
        duck.giveVoice();
*/
         Animal dog = new Dog(); //rownie dobrze mozna bylo utworzyc obiekt klasycznie poprzez: Dog dog = new Dog();
       // Dog dog = new Dog();
        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);

        Animal duck = new Duck();
        processor.process(duck);

        Fish fish = new Fish();
        processor.process(fish);

        Animal horse = new Horse("black");
        processor.process(horse);


}
}

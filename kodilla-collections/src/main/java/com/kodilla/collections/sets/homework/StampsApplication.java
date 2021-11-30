package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Donald duck", "1.5x1.5", false));
        stamps.add(new Stamp("Mickey Mouse", "1.5x1.2", true));
        stamps.add(new Stamp("Mickey Mouse", "1.5x1.2", false));
        stamps.add(new Stamp("Mickey Mouse", "1.5x1.2", true));
        stamps.add(new Stamp("Nirvana", "1x1", true));

        System.out.println("W tej kolekcji są: " + stamps.size() + " znaczki:");
        for(Stamp stamp : stamps){
            System.out.println(stamp);
        }
        System.out.println("---------------------------------------");
        stamps.remove(new Stamp("Nirvana", "1x1", true));
        System.out.println("usunięto jeden znaczek");
        System.out.println("---------------------------------------");
        System.out.println("W tej kolekcji są: " + stamps.size() + " znaczki:");
        for(Stamp stamp : stamps){
            System.out.println(stamp);
        }

    }
}

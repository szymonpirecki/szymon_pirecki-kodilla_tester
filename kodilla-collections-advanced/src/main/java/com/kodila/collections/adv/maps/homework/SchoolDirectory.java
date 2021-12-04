package com.kodila.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SchoolDirectory {
    public static void main(String[] args) {

        School szkola1klasa1a = new School(30);
        School szkola1klasa1b = new School(29);
        School szkola1klasa2a = new School(30);
        School szkola1klasa2b = new School(26);
        School szkola1klasa3a = new School(29);
        School szkola1klasa3b = new School(24);

        List<School> school1 = new ArrayList<>();

        school1.add(szkola1klasa1a);
        school1.add(szkola1klasa1b);
        school1.add(szkola1klasa2a);
        school1.add(szkola1klasa2b);
        school1.add(szkola1klasa3a);
        school1.add(szkola1klasa3b);

//
//            for(int i = 0; i <= school1.size(); i++){
//                int sum = 0;
//                sum += school1.get(i).getQuantityOfStudents();
//            System.out.println(sum);}






        School szkola2klasa1a = new School(23);
        School szkola2klasa1b = new School(35);
        School szkola2klasa2a = new School(33);
        School szkola2klasa2b = new School(19);
        School szkola2klasa3a = new School(19);
        School szkola2klasa3b = new School(19);

        List<School> school2 = new ArrayList<>();

        school2.add(szkola2klasa1a);
        school2.add(szkola2klasa1b);
        school2.add(szkola2klasa2a);
        school2.add(szkola2klasa2b);
        school2.add(szkola2klasa3a);
        school2.add(szkola2klasa3b);


        School szkola3klasa1a = new School(33);
        School szkola3klasa1b = new School(32);
        School szkola3klasa2a = new School(23);
        School szkola3klasa2b = new School(13);
        School szkola3klasa3a = new School(39);
        School szkola3klasa3b = new School(12);

        List<School> school3 = new ArrayList<>();

        school3.add(szkola3klasa1a);
        school3.add(szkola3klasa1b);
        school3.add(szkola3klasa2a);
        school3.add(szkola3klasa2b);
        school3.add(szkola3klasa3a);
        school3.add(szkola3klasa3b);


        School szkola4klasa1a = new School(13);
        School szkola4klasa1b = new School(22);
        School szkola4klasa2a = new School(33);
        School szkola4klasa2b = new School(33);
        School szkola4klasa3a = new School(19);
        School szkola4klasa3b = new School(42);

        List<School> school4 = new ArrayList<>();

        school4.add(szkola4klasa1a);
        school4.add(szkola4klasa1b);
        school4.add(szkola4klasa2a);
        school4.add(szkola4klasa2b);
        school4.add(szkola4klasa3a);
        school4.add(szkola4klasa3b);


        Principal leonSzpak = new Principal("Leon", "Szpak");
        Principal andrzejKruk = new Principal("Andrzej", "Kruk");
        Principal konradDrozd = new Principal("Konrad", "Drozd");
        Principal gabrielaCzajka = new Principal("Gabriela", "Czajka");

        Map<Principal, List<School>> schoolDirectory = new HashMap<>();

        schoolDirectory.put(leonSzpak, school1);
        schoolDirectory.put(andrzejKruk, school2);
        schoolDirectory.put(konradDrozd, school3);
        schoolDirectory.put(gabrielaCzajka, school4);

        for(Map.Entry<Principal, List<School>> principals : schoolDirectory.entrySet()){

            System.out.println(principals.getKey().getFirstname() + " " + principals.getKey().getLastname() + " jest dyrektorem szkoły");
        }



    }
}

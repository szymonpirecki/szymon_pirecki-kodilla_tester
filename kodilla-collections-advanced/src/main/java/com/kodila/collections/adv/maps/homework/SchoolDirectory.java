package com.kodila.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;


public class SchoolDirectory {
    public static void main(String[] args) {

        School school1 = new School();

        school1.getClassesInSchool1().add(school1.szkola1klasa1a);
        school1.getClassesInSchool1().add(school1.szkola1klasa1b);
        school1.getClassesInSchool1().add(school1.szkola1klasa2a);
        school1.getClassesInSchool1().add(school1.szkola1klasa2b);

        System.out.println(school1.getSumOfStudentsInSchool1());


        School school2 = new School();

        school2.getClassesInSchool2().add(school2.szkola2klasa1a);
        school2.getClassesInSchool2().add(school2.szkola2klasa1b);
        school2.getClassesInSchool2().add(school2.szkola2klasa2a);
        school2.getClassesInSchool2().add(school2.szkola2klasa2b);

        System.out.println(school2.getSumOfStudentsInSchool2());


    Principal leonSzpak = new Principal("Leon", "Szpak", 1);
    Principal gabrielaCzajka = new Principal("Gabriela", "Czajka", 2);

    Map<Principal, School> schoolDirectory = new HashMap<>();

    schoolDirectory.put(leonSzpak, school1);
    schoolDirectory.put(gabrielaCzajka, school2);

    for(Map.Entry<Principal, School> principalSchoolEntry : schoolDirectory.entrySet()){
        System.out.println("--------------------");
        System.out.println(principalSchoolEntry.getKey().getFirstname() + " " + principalSchoolEntry.getKey().getLastname());
        System.out.println("Dryrektor szkoły numer: " + principalSchoolEntry.getKey().getSchoolNumber());
      //  System.out.println("Szkoła numer: " + principalSchoolEntry.getKey().getSchoolNumber() + " liczy: " + principalSchoolEntry.getValue().); i tutaj bym chcial uzyc metody getSumOf ale musza ja uogolnic zeby moc uzyc jej w petli, jak to zrobic?
    }
}
}



//
////        for(Map.Entry<Principal, List<School>> principals : schoolDirectory.entrySet()){
////
////            System.out.println(principals.getKey().getFirstname() + " " + principals.getKey().getLastname() + " jest dyrektorem szkoły");
////        }
////
////
//
//    }
//}

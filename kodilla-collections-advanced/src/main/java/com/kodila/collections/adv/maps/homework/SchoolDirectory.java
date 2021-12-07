package com.kodila.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;


public class SchoolDirectory {
    public static void main(String[] args) {

       School school1 = new School(11, 22, 33);
       School school2 = new School(22, 11, 11);


    Principal leonSzpak = new Principal("Leon", "Szpak", 1);
    Principal gabrielaCzajka = new Principal("Gabriela", "Czajka", 2);

    Map<Principal, School> schoolDirectory = new HashMap<>();

    schoolDirectory.put(leonSzpak, school1);
    schoolDirectory.put(gabrielaCzajka, school2);

    for(Map.Entry<Principal, School> principalSchoolEntry : schoolDirectory.entrySet()){
        System.out.println("--------------------");
        System.out.println("Dryrektor szkoły numer: " + principalSchoolEntry.getKey().getSchoolNumber() + ".");
        System.out.println(principalSchoolEntry.getKey().getFirstname() + " " + principalSchoolEntry.getKey().getLastname());
        System.out.println("Szkoła numer " + principalSchoolEntry.getKey().getSchoolNumber() + ". liczy " + principalSchoolEntry.getValue().getSumOfStudents() + " uczniów.");
    }
}
}


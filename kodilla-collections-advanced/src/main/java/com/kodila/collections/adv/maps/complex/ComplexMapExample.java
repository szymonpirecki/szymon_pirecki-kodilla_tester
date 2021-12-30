package com.kodila.collections.adv.maps.complex;

import java.util.HashMap;
import java.util.Map;

public class ComplexMapExample {
    public static void main(String[] args) {
        Map<Student, Grades> school = new HashMap<>();

        Student john = new Student("John", "Deer");
        Student dick = new Student("Dick", "Lee");
        Student tom = new Student("Tom", "Novak");

        Grades johnGrades = new Grades(5.0, 4.0, 4.5, 5.0, 5.0);
        Grades dickGrades = new Grades(2.5, 3.0, 2.0);
        Grades tomGrades = new Grades(4.0, 4.0, 4.0, 4.0, 5.0);

//        System.out.println(dickGrades[1]);    zmienna grades jest tablicą, do której elementów można dostać się, podając ich indeks, -  nie mozna
        //System.out.println(dickGrades.);
        school.put(john, johnGrades);
        school.put(dick, dickGrades);
        school.put(tom, tomGrades);

        System.out.println(school.get(john));
        System.out.println(john.getFirstname() + " " + john.getLastname() + "'s score is " + johnGrades.getAverage());

        for(Map.Entry<Student, Grades> studentEntry : school.entrySet()){
            System.out.println(studentEntry.getKey().getFirstname() + " " + studentEntry.getKey().getLastname() + ", average: " + studentEntry.getValue().getAverage() + ", last grade: " + studentEntry.getValue().getLastGrade() + ", first grade: " + studentEntry.getValue().getFirstGrade());
        }
    }
}

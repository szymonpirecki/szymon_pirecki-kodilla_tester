package com.kodila.collections.adv.maps.homework;

import java.util.*;

public class School {

    List<Integer> classesInSchool1 = new ArrayList<>();

    public List<Integer> getClassesInSchool1() {
        return classesInSchool1;
    }


    public int szkola1klasa1a = 30; //dlaczego te inty sa niepotrzebne?
    public int szkola1klasa1b = 29;
    public int szkola1klasa2a = 30;
    public int szkola1klasa2b = 26;

    public int getSumOfStudentsInSchool1(){
        int sum = 0;
        for(int students : classesInSchool1){
            sum += students;
        }
        return sum;
    }

    List<Integer> classesInSchool2 = new ArrayList<>();

    public List<Integer> getClassesInSchool2(){
        return classesInSchool2;
    }
    public int szkola2klasa1a = 31;
    public int szkola2klasa1b = 21;
    public int szkola2klasa2a =31;
    public int szkola2klasa2b = 21;

    public int getSumOfStudentsInSchool2(){
        int sum = 0;
        for(int students : classesInSchool2){
            sum += students;
        }
        return sum;
    }

}






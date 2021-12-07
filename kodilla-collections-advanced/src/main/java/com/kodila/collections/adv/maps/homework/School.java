package com.kodila.collections.adv.maps.homework;

import java.util.*;

public class School {
    private List<Integer> schools = new ArrayList<>();

    public School(Integer... students) {
        for (Integer schoolClass : students) {
            this.schools.add(schoolClass);
        }
    }

    public int getSumOfStudents() {
        int sum = 0;
        for (int students : schools) {
            sum += students;
        }
        return sum;
    }
}




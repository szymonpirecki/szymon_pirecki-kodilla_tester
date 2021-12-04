package com.kodila.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private int quantityOfStudents;

    public School(int quantityOfStudents) {
        this.quantityOfStudents = quantityOfStudents;
    }

    public int getQuantityOfStudents() {
        return quantityOfStudents;
    }

    @Override
    public String toString() {
        return "School{" +
                "quantityOfStudents=" + quantityOfStudents +
                '}';
    }
}


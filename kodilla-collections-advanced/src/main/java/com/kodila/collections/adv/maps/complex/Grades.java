package com.kodila.collections.adv.maps.complex;

import java.util.ArrayList;
import java.util.List;

public class Grades {
    private List<Double> grades = new ArrayList<>();

//    public Grades(List<Double> grades) {
//        this.grades = grades;
//    }

    public Grades(double... grades) {
        for(double grade : grades){
            this.grades.add(grade);
            //W powyższym kodzie wykorzystaliśmy pętlę do przepisania ocen z tablicy grades do listy grades.
        }
    }

    public double getAverage(){
        double sum = 0;
        for(double grade : grades){
            sum += grade;}
            return sum/grades.size();
    }
    public double getLastGrade(){
        return grades.get(grades.size() - 1);
    }
    public double getFirstGrade(){
        return grades.get(grades.size() - grades.size());
    }

    @Override
    public String toString() {
        return "Grades{" +
                "grades=" + grades +
                '}';
    }

}

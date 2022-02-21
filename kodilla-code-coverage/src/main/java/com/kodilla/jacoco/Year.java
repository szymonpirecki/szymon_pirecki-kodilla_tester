package com.kodilla.jacoco;

public class Year {
    private int theYear;

    public Year(int year) {
        this.theYear = year;
    }

    public boolean isLeap() {
        return theYear % 4 == 0 && theYear % 100 != 0 || theYear % 400 == 0;
    }
}
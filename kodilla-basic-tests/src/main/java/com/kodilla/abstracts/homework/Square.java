package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private int a;

    public Square(int a){
        this.a = a;
    }

    @Override
    public void area() {
        int areaOfASquare = a * a;
        System.out.println("Pole kwadratu o boku " + a + " wynosi: " + areaOfASquare + ".");
    }

    @Override
    public void circumference() {
        int circumferenceOfASquare = 4 * a;
        System.out.println("Obwód kwadratu o boku " + a + " wynosi: " + circumferenceOfASquare + ".");

    }

}

package com.kodilla.abstracts.homework.shapes;

public class Rectangle extends Shape {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public void area() {
        int areaOfARectangle = a * b;
        System.out.println("Pole prostokąta o bokach: " + a + " i " + b + " wynosi: " + areaOfARectangle + ".");
    }

    @Override
    public void circumference() {
        int circumferenceOfARectangle = 2 * a + 2 * b;
        System.out.println("Obwód prostokąta o bokach: " + a + " i " + b + " wynosi: " + circumferenceOfARectangle + ".");
    }

    public void coTo() {
        System.out.println("to jest prostokąt");
    }
}

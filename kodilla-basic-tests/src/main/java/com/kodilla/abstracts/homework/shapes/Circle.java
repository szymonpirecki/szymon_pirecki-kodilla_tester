package com.kodilla.abstracts.homework.shapes;

public class Circle extends Shape {
    private int r;
    static final double PI = 3.14;

    public Circle(int r){
        this.r = r;
    }

    @Override
    public void area() {
        double areaOfACircle = PI * r * r;
        System.out.println("Pole koła o promieniu " + r + " wynosi: " + areaOfACircle + ".");

    }

    @Override
    public void circumference() {
        double circumferenceOfACircle = 2 * PI * r;
        System.out.println("Obwód koła o promieniu " + r + " wynosi: " + circumferenceOfACircle + ".");

    }
}

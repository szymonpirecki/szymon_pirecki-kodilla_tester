package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape square = new Square(10);
        Shape rectangle = new Rectangle(10, 5);
        Shape circle = new Circle(10);

        square.area();
        square.circumference();
        rectangle.area();
        rectangle.circumference();
        circle.area();
        circle.circumference();
    }
}

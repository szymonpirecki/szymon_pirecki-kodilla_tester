package com.kodilla.abstracts.homework.shapes;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(10);
        Shape rectangle = new Rectangle(10, 5);
        Circle circle = new Circle(10);

        square.coTo();
        square.area();
        square.circumference();
        rectangle.area();
        rectangle.circumference();
        circle.area();
        circle.circumference();
    }
}

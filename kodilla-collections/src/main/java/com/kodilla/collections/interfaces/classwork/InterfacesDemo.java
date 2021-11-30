package com.kodilla.collections.interfaces.classwork;

public class InterfacesDemo {
    public static void main(String[] args) {
        Square square = new Square(10.0);
        showShapeDetails(square);

        Circle circle = new Circle(7.0);
        showShapeDetails(circle);

        Triangle triangle = new Triangle(6.0, 4.0, 7.211);
        showShapeDetails(triangle);

        Rectangle rectangle = new Rectangle(2, 4);
        showShapeDetails(rectangle);
    }

    private static void showShapeDetails(Shape shape) {

        System.out.println("Area of the " + shape + ": " + shape.getArea());
        System.out.println("Perimeter of the  " + shape + ": " + shape.getPerimeter());
    }


}

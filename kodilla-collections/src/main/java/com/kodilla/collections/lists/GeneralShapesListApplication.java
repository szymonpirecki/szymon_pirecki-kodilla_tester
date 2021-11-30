package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.classwork.Circle;
import com.kodilla.collections.interfaces.classwork.Shape;
import com.kodilla.collections.interfaces.classwork.Square;
import com.kodilla.collections.interfaces.classwork.Triangle;

import java.util.LinkedList;
import java.util.List;

public class GeneralShapesListApplication {
    public static void main(String[] args) {

        List<Shape> shapes = new LinkedList<>();
       Square square = new Square(10);
        shapes.add(square);
        shapes.add(new Circle(7));
        shapes.add(new Triangle(10, 4, 10.77));

        shapes.remove(1);
        shapes.remove(square);
        Triangle triangle = new Triangle(10, 4, 10.77);
        shapes.remove(triangle);
        System.out.println(shapes.size());

        for(Shape shape : shapes){
            System.out.println(shape + ", area: " + shape.getArea() + ", perimeter: " + shape.getPerimeter());
        }
    }
}

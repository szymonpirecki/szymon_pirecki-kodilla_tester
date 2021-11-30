package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.classwork.Circle;
import com.kodilla.collections.interfaces.classwork.Shape;
import com.kodilla.collections.interfaces.classwork.Square;
import com.kodilla.collections.interfaces.classwork.Triangle;
import com.kodilla.collections.interfaces.classwork.Rectangle;

public class ShapeUtils {
    public static void displayShapeInfo(Shape shape) {
        System.out.println("-----------------------------");
        System.out.println("Shape kind: " + getShapeName(shape));
        System.out.println("Shape area: " + shape.getArea());
        System.out.println("Shape perimeter: " + shape.getPerimeter());
    }

    private static String getShapeName(Shape shape) {
        if (shape instanceof Circle){
            return "Circle";}
        else if (shape instanceof Triangle){
            return "Triangle";}
        else if (shape instanceof Square){
            return "Square";}
        else if (shape instanceof Rectangle){
            return "Rectangle";}
        else{return "other shape";}
    }
}
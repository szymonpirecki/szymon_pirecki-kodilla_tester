package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.classwork.Circle;
import com.kodilla.collections.interfaces.classwork.Shape;
import com.kodilla.collections.interfaces.classwork.Square;
import com.kodilla.collections.interfaces.classwork.Triangle;
import com.kodilla.collections.interfaces.classwork.Rectangle;


import java.util.Random;

import static com.kodilla.collections.arrays.ShapeUtils.displayShapeInfo; ///tez opcja

public class ShapeApplication {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        for(int n = 0; n < shapes.length; n++){
            shapes[n] = drawShape();
        }
        for (Shape shape : shapes)
            displayShapeInfo(shape);    ///bez importu ShapeUtils.displayShapeInfo(shape);
    }


    private static Shape drawShape() {
        Random random = new Random();
        int drawnShapeKind = random.nextInt(4);
        double a = random.nextDouble() * 100 + 1;
        double b = random.nextDouble() * 100 + 1;
        double c = random.nextDouble() * 100 + 1;

        if(drawnShapeKind == 0){
            return new Circle(a);}
        else if (drawnShapeKind == 1){
            return new Square(a);}
        else if(drawnShapeKind == 2){
            return new Rectangle(a, b);}
        else{
            return new Triangle(a, b, c);
        }
    }
}

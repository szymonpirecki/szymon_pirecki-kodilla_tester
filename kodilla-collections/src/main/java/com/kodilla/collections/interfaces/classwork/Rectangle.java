package com.kodilla.collections.interfaces.classwork;

import java.util.Objects;

public class Rectangle implements Shape{
    private double width;
    private double hight;

    public Rectangle(double width, double hight){
        this.width = width;
        this.hight = hight;
    }
    @Override
    public double getArea() {
        return width * hight;
    }

    @Override
    public double getPerimeter() {
        return 2 * hight + 2 * width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 && Double.compare(rectangle.hight, hight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, hight);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", hight=" + hight +
                '}';
    }
}

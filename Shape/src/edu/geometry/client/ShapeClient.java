package edu.geometry.client;

import edu.geometry.Rectangle;
import edu.geometry.Circle;
import edu.geometry.Shape;

import java.awt.*;

class ShapeClient {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle(2.5);
        shapes[1] = new Circle(3.2);

        shapes[2] = new Rectangle(2.0, 3.0);
        shapes[3] = new Rectangle(2.0, 4.0);

        for (Shape shape : shapes) {
            System.out.printf("The area of the %s is %s\n", shape.getClass().getSimpleName(), shape.area());
        }
    }
}
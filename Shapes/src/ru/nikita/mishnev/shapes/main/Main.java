package ru.nikita.mishnev.shapes.main;

import ru.nikita.mishnev.shapes.Circle;
import ru.nikita.mishnev.shapes.interfaces.Shape;
import ru.nikita.mishnev.shapes.Rectangle;
import ru.nikita.mishnev.shapes.Square;
import ru.nikita.mishnev.shapes.Triangle;
import ru.nikita.mishnev.shapes.comparators.ShapeAreaComparator;
import ru.nikita.mishnev.shapes.comparators.ShapePerimeterComparator;

import java.util.Arrays;

public class Main {
    private static Shape getShapeByArea(Shape[] shapes, int numberByArea) {
        Arrays.sort(shapes, new ShapeAreaComparator());

        return shapes[shapes.length - numberByArea];
    }

    private static Shape getShapeByPerimeter(Shape[] shapes, int numberByPerimeter) {
        Arrays.sort(shapes, new ShapePerimeterComparator());

        return shapes[shapes.length - numberByPerimeter];
    }

    public static void main(String[] args) {
        Shape square1 = new Square(4);
        Shape square2 = new Square(3);
        Shape rectangle1 = new Rectangle(3, 5);
        Shape rectangle2 = new Rectangle(4, 6);
        Shape triangle1 = new Triangle(1, -3, 2, 1, 4, 3);
        Shape circle1 = new Circle(4);

        Shape[] shapes1 = {square1, triangle1, square2, rectangle1, rectangle2, circle1};
        int numberByArea = 1;

        System.out.println(getShapeByArea(shapes1, numberByArea));
        System.out.println();

        Shape[] shapes2 = {square1, square2, rectangle1, rectangle2, circle1};
        int numberByPerimeter = 2;

        System.out.println(getShapeByPerimeter(shapes2, numberByPerimeter));
    }
}

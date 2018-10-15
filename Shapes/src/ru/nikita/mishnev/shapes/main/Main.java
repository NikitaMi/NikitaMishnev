package ru.nikita.mishnev.shapes.main;

import ru.nikita.mishnev.shapes.Circle;
import ru.nikita.mishnev.shapes.Interfaces.Shape;
import ru.nikita.mishnev.shapes.Rectangle;
import ru.nikita.mishnev.shapes.Square;
import ru.nikita.mishnev.shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape square1 = new Square(4);
        Shape square2 = new Square(3);
        Shape rectangle1 = new Rectangle(3, 5);
        Shape rectangle2 = new Rectangle(4, 6);
        Shape triangle1 = new Triangle(1, -3, 2, 1, 4, 3);
        Shape circle1 = new Circle(4);
        System.out.println(triangle1.getPerimeter());

    }
}

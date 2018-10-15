package ru.nikita.mishnev.shapes;

import ru.nikita.mishnev.shapes.Interfaces.Shape;

public class Circle implements Shape {
    private double radius;
    private double diameter = radius * 2;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double getWidth() {
        return diameter;
    }

    @Override
    public double getHeight() {
        return diameter;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

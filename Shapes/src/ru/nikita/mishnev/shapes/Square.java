package ru.nikita.mishnev.shapes;

import ru.nikita.mishnev.shapes.Interfaces.Shape;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getWidth() {
        return side;
    }

    @Override
    public double getHeight() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        int sidesCount = 4;
        return side * sidesCount;
    }
}

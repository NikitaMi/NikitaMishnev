package ru.nikita.mishnev.shapes;

import ru.nikita.mishnev.shapes.interfaces.Shape;

import java.util.Objects;

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

    @Override
    public String toString() {
        return String.format("Квадрат.%nПлощадь = %.2f%nСторона = %.2f%nПериметр = %.2f", getArea(), getHeight(), getPerimeter());
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (object instanceof Square) {
            Square square = (Square) object;

            return this.side == square.side;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }
}

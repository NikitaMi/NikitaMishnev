package ru.nikita.mishnev.shapes;

import ru.nikita.mishnev.shapes.interfaces.Shape;

import java.util.Objects;

public class Circle implements Shape {
    private double radius;
    private double diameter;

    public Circle(double radius) {
        this.radius = radius;
        this.diameter = radius * 2;
    }


    @Override
    public double getWidth() {
        return this.diameter;
    }

    @Override
    public double getHeight() {
        return this.diameter;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Круг.%nРадиус = %.2f%nПлощадь = %.2f%nДлина круга = %.2f", getHeight() / 2, getArea(), getPerimeter());
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (object instanceof Circle) {
            Circle circle = (Circle) object;

            return this.radius == circle.radius;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}

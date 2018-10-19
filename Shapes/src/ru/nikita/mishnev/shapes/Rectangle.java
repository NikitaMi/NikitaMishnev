package ru.nikita.mishnev.shapes;

import ru.nikita.mishnev.shapes.interfaces.Shape;

import java.util.Objects;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return width + width + height + height;
    }

    @Override
    public String toString() {
        return String.format("Прямоугольник.%nПлощадь = %.2f%nШирина = %.2f%nВысота = %.2f%nПериметр = %.2f", getArea(), getWidth(), getHeight(), getPerimeter());
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (object instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) object;

            return this.width == rectangle.width && this.height == rectangle.height;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }
}

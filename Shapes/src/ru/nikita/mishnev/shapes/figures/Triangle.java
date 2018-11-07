package ru.nikita.mishnev.shapes.figures;

import ru.nikita.mishnev.shapes.interfaces.Shape;

public class Triangle implements Shape {
    private double x1;
    private double y1;

    private double x2;
    private double y2;

    private double x3;
    private double y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;

        this.x2 = x2;
        this.y2 = y2;

        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    public double getWidth() {
        return Math.max(Math.max(x1, x2), x3) - Math.min(Math.min(x1, x2), x3);
    }

    @Override
    public double getHeight() {
        return Math.max(Math.max(y1, y2), y3) - Math.min(Math.min(y1, y2), y3);
    }

    private double getSegmentLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    private double[] getTriangleSides() {
        double sideAB = getSegmentLength(x1, y1, x2, y2);
        double sideBC = getSegmentLength(x2, y2, x3, y3);
        double sideCA = getSegmentLength(x3, y3, x1, y1);
        return new double[]{sideAB, sideBC, sideCA};
    }

    @Override
    public double getArea() {
        double[] triangleSides = getTriangleSides();
        double halfPerimeter = ((triangleSides[0] + triangleSides[1] + triangleSides[2]) / 2);

        return Math.sqrt(halfPerimeter * (halfPerimeter - triangleSides[0]) * (halfPerimeter - triangleSides[1]) * (halfPerimeter - triangleSides[2]));
    }

    @Override
    public double getPerimeter() {
        double[] triangleSides = getTriangleSides();
        return triangleSides[0] + triangleSides[1] + triangleSides[2];
    }

    @Override
    public String toString() {
        return String.format("Triangle.%nx1 = %.2f y1 = %.2f%nx2 = %.2f y2 = %.2f%nx3 = %.2f y3 = %.2f", x1, y1, x2, y2, x3, y3);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }

        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }

        Triangle triangle = (Triangle) object;
        return (triangle.x1 == this.x1 && triangle.y1 == this.y1 && triangle.x2 == this.x2 && triangle.y2 == this.y2 && triangle.x3 == this.x3 && triangle.y3 == this.y3);
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Double.hashCode(x1);
        hash = prime * hash + Double.hashCode(y1);
        hash = prime * hash + Double.hashCode(x2);
        hash = prime * hash + Double.hashCode(y2);
        hash = prime * hash + Double.hashCode(x3);
        hash = prime * hash + Double.hashCode(y3);
        return hash;
    }
}

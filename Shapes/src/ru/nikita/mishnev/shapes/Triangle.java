package ru.nikita.mishnev.shapes;

import ru.nikita.mishnev.shapes.Interfaces.Shape;

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

    private double[] getTriangleSides() {
        double sideAB = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double sideBC = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        double sideCA = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));

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
}

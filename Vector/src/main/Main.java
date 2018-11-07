package main;

import vector.Vector;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(new double[]{2, 1, 4});
        Vector vector2 = new Vector(4, new double[]{2, 1});

        System.out.printf("1) vector1 %s + vector2 %s = ", vector1.toString(), vector2.toString());
        vector1.addVector(vector2);
        System.out.println(vector1);

        Vector vector3 = new Vector(3);
        Vector vector2Copy = new Vector(vector2);
        System.out.printf("2) vector3 %s - vector2Copy %s = ", vector3, vector2Copy);
        vector3.subtractVector(vector2Copy);
        System.out.println(vector3);

        int scalar = 3;
        System.out.printf("3) vector2Copy %s * %d = ", vector2Copy, scalar);
        vector2Copy.multiplyByScalar(scalar);
        System.out.println(vector2Copy);

        Vector vector4 = new Vector(new double[]{5, -2, 3});
        System.out.printf("4) Обратный вектор вектора vector4 %s = ", vector4);
        vector4.reverse();
        System.out.println(vector4);

        Vector vector5 = new Vector(new double[]{3, 2, 4});
        System.out.printf("5) Длина вектора vector5 %s = ", vector5);
        System.out.println(vector5.getLength());

        System.out.printf("6) Компонента вектора vector5 %s по индексу 1 = %.2f%n", vector5.toString(), vector5.getComponentByIndex(1));

        double newComponent = 9;
        System.out.printf("7) Задать вектору vector5 %s новую компоненут %.2f по индексу 2. vector5 = ", vector5, newComponent);
        vector5.setComponentByIndex(2, newComponent);
        System.out.println(vector5);

        System.out.printf("8) vector6 = vector1 %s + vector2 %s = ", vector1, vector2);
        Vector vector6 = Vector.addVectors(vector1, vector2);
        System.out.println(vector6);

        System.out.printf("9) vector7 = vector1 %s - vector2 %s = ", vector1, vector2);
        Vector vector7 = Vector.subtractVectors(vector1, vector2);
        System.out.println(vector7);

        double scalarProduct = Vector.getScalar(vector1, vector2);
        System.out.printf("10) Скалярное произведение векторов vector1 и vector2 = %.2f%n", scalarProduct);

        System.out.println("11) Размерность вектора vector5 = " + vector5.getSize());
    }
}
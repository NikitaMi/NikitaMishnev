package main;

import vector.Vector;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] array1 = {0, 5, 3};
        Vector vector1 = new Vector(array1);

        double[] array2 = {0, 5, 3};
        Vector vector2 = new Vector(array2);
        System.out.println(vector1.hashCode() + " " + vector2.hashCode());

//        vector1.setComponentByIndex(2, 9);

//        System.out.println(Arrays.toString(vector1.getComponents()));

//
//        double[] array = {1, 4, 2, 1, 4};
//        Vector vector2 = new Vector(array);
//
//        vector1.subtractVector(vector2);
//      System.out.println(Arrays.toString(vector1.getComponents()));

//        double[] array1 = {1, 3, 5};
//        Vector vector1 = new Vector(array1);
//
//        double[] array2 = {3, 2, 2};
//        Vector vector2 = new Vector(array2);
//
//        vector1.fillMinVector(vector2);
//        System.out.println(Arrays.toString(vector1.getComponents()));
//        System.out.println(vector1.getSize());
//        System.out.println();
//        System.out.println(Arrays.toString(vector2.getComponents()));
//        System.out.println(vector2.getSize());
    }
}

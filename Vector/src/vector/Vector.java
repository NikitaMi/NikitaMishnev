package vector;

import java.util.Arrays;

public class Vector {
    private int n;
    private double[] components;

    public Vector(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Недопустимое значение размерности");
        }

        this.n = n;
        this.components = new double[n];
    }

    public Vector(Vector vector) {
        this.n = vector.n;
        this.components = Arrays.copyOf(vector.components, vector.n);
    }

    public Vector(double[] components) {
        n = components.length;
        this.components = Arrays.copyOf(components, n);
    }

    public Vector(int n, double[] components) {
        if (n <= 0) {
            throw new IllegalArgumentException("Недопустимое значение размерности");
        }

        this.n = n;
        this.components = Arrays.copyOf(components, n);
    }

    public int getSize() {
        return n;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        for (int i = 0; ; i++) {
            sb.append(components[i]);
            if (components.length - 1 == i) {
                return sb.append('}').toString();
            }
            sb.append(", ");
        }
    }

    private boolean isBigger(Vector vector) {
        int vector1Size = this.components.length;
        int vector2Size = vector.components.length;

        return vector1Size >= vector2Size;
    }

    private void fillMinVector(Vector vector1) {
        if (this.getSize() != vector1.getSize()) {
            int vector1Size = this.components.length;
            int vector2Size = vector1.components.length;

            if (this.isBigger(vector1)) {
                vector1.n = vector1Size;
                vector1.components = Arrays.copyOf(vector1.components, vector1Size);
                return;
            }
            this.n = vector2Size;
            this.components = Arrays.copyOf(this.components, vector2Size);
        }
    }

    public void addVector(Vector vector) {
        this.fillMinVector(vector);

        for (int i = 0; i < this.components.length; i++) {
            this.components[i] += vector.components[i];
        }
    }

    public void subtractVector(Vector vector) {
        this.fillMinVector(vector);

        for (int i = 0; i < this.components.length; i++) {
            this.components[i] -= vector.components[i];
        }
    }

    public void multiplyByScalar(double scalar) {
        for (int i = 0; i < this.components.length; i++) {
            this.components[i] *= scalar;
        }
    }

    public void reverse() {
        for (int i = 0; i < this.components.length; i++) {
            this.components[i] *= -1;
        }
    }

    public int getLength() {
        int vectorLength = 0;

        for (double component : this.components) {
            vectorLength += component * component;
        }
        return vectorLength;
    }

    public double getComponentByIndex(int index) {
        return this.components[index];
    }

    public void setComponentByIndex(int index, double component) {
        this.components[index] = component;
    }

    public static Vector addVectors(Vector vector1, Vector vector2) {
        vector1.addVector(vector2);
        return vector1;
    }

    public static Vector subtractVectors(Vector vector1, Vector vector2) {
        vector1.subtractVector(vector2);
        return vector1;
    }

    public static double getScalar(Vector vector1, Vector vector2) {
        vector1.fillMinVector(vector2);
        double scalar = 0;

        for (int i = 0; i < vector1.components.length; i++) {
            scalar += vector1.components[i] * vector2.components[i];
        }

        return scalar;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Vector vector = (Vector) obj;
        return n == vector.n && Arrays.equals(components, vector.components);
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;

        hash = prime * hash + Double.hashCode(n);
        hash = prime * hash + Arrays.hashCode(components);
        return hash;
    }
}

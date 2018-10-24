package vector;

import java.util.Arrays;

public class Vector {
    private int n;
    private double[] components;

    public Vector(int n) {
        this.n = n;
        this.components = new double[n];
        //TODO БРОСИТЬ ИСКЛЮЧЕНИЕ
    }

    public Vector(Vector vector) {
        this.n = vector.n;
        this.components = vector.components;
    }

    public Vector(double[] components) {
        this.components = components;
        n = components.length;
    }

    public Vector(int n, double[] components) {
        //TODO ПЕРЕДЕЛАТЬ КОНСТРУКТОР
        this.n = n;
        components = new double[n];
        this.components = components;
        //TODO БРОСИТЬ ИСКЛЮЧЕНИЕ
    }

    public int getSize() {
        return n;
    }

    public void setSize(int n) {
        this.n = n;
        //TODO БРОСИТЬ ИСКЛЮЧЕНИЕ
    }

    public double[] getComponents() {
        return components;
    }

    public void setComponents(double[] components) {
        this.components = components;
        //TODO БРОСИТЬ ИСКЛЮЧЕНИЕ
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

    public boolean isBigger(Vector vector) {
        int vector1Size = this.components.length;
        int vector2Size = vector.components.length;

        return vector1Size >= vector2Size;
    }


    public void fillMinVector(Vector vector1) {
        int vector1Size = this.components.length;
        int vector2Size = vector1.components.length;

        if (this.isBigger(vector1)) {
            vector1.setSize(vector1Size);
            vector1.setComponents(Arrays.copyOf(vector1.components, vector1Size));
            return;
        }
        this.setSize(vector2Size);
        this.setComponents(Arrays.copyOf(this.components, vector2Size));
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

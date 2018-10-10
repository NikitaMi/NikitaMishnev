package ru.nikita.mishnev.range;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        if (from > to) {
            double temp = to;
            to = from;
            from = temp;
        }
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    public double getLength() {
        return to - from;
    }

    public boolean isInside(double number) {
        return number >= from && number <= to;
    }

    public static Range getIntersection(Range range1, Range range2) {
        if (range1.to < range2.from || range1.from > range2.to) {
            return null;
        }
        return new Range(Math.max(range1.from, range2.from), Math.min(range1.to, range2.to));
    }

    public static Range[] getUnion(Range range1, Range range2) {
        if (range1.to < range2.from || range1.from > range2.to) {
            return new Range[]{new Range(range1.from, range1.to), new Range(range2.from, range2.to)};
        }
        return new Range[]{new Range(Math.min(range1.from, range2.from), Math.max(range1.to, range2.to))};
    }

    public static Range[] getDifference(Range range1, Range range2) {
        if (range2.from <= range1.from && range2.to > range1.from) {
            if (range2.to < range1.to) {
                return new Range[]{new Range(range2.to, range1.to)};
            }
            return new Range[]{null};
        }

        if (range1.from < range2.from && range2.from < range1.to) {
            if (range1.to <= range2.to) {
                return new Range[]{new Range(range1.from, range2.from)};
            }
            return new Range[]{new Range(range1.from, range2.from), new Range(range2.to, range1.to)};
        }

        return new Range[]{range1};
    }
}
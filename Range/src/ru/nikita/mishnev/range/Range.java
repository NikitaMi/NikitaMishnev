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

    public void setFrom(double from) {
        this.from = from;
    }

    public void setTo(double to) {
        this.to = to;
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

        if (range1.from == range2.from) {
            if (range1.to > range2.to) {
                return new Range(range2.from, range2.to);
            }
            return new Range(range1.from, range1.to);
        }

        if (range1.to == range2.to) {
            if (range1.from < range2.from) {
                return new Range(range2.from, range2.to);
            }
            return new Range(range1.from, range1.to);
        }

        if (range1.from < range2.from) {
            if (range1.to > range2.to) {
                return new Range(range2.from, range2.to);
            }
            return new Range(range2.from, range1.to);
        }

        if (range2.from < range1.from) {
            if (range2.to > range1.to) {
                return new Range(range1.from, range1.to);
            }
            return new Range(range1.from, range2.to);
        }
        return new Range(range1.from, range1.to);
    }

    public static Range[] getUnion (Range range1, Range range2) {
        if (range1.from == range2.from){
            if (range1.to > range2.to) {
                return new Range[]{range1};
            }
            return new Range[]{range2};
         }

         if (range1.from < range2.from) {
             if(range1.to < range2.to) {
                 
             }
         }
         return null;
    }







  /*  public static void main(String[] args) {
        Range range1 = new Range(3, 10);

        double length = range1.getLength();
        System.out.println("Длина первого диапазона равна " + length);

        int number = 5;
        if (range1.isInside(number)) {
            System.out.println("Число " + number + " принадлежит первому числовому диапазону.");
        } else {
            System.out.println("Число " + number + " не принадлежит первому числовому диапазону.");
        }

        Range range2 = new Range(1, 2);

        range2.setFrom(6);
        range2.setTo(8);

        System.out.println("Нижняя граница второго диапазона " + range2.getFrom());
        System.out.println("Верхняя граница второго диапазона " + range2.getTo());

        if (range2.isInside(number)) {
            System.out.println("Число " + number + " принадлежит второму числовому диапазону.");
        } else {
            System.out.println("Число " + number + " не принадлежит второму числовому диапазону.");
        }
    }*/
}
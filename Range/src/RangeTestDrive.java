import ru.nikita.mishnev.range.Range;

public class RangeTestDrive {
    public static void main(String[] args) {
        Range range1 = new Range(2, 9);

        System.out.println("Длина интервала range1 = " + range1.getLength());
        System.out.println();

        int number = 5;
        if (range1.isInside(number)) {
            System.out.println("Число " + number + " принадлежит диапазону range1");
            System.out.println();
        }

        Range range2 = new Range(4, 12);
        Range intersection = Range.getIntersection(range1, range2);

        if (intersection != null) {
            System.out.println("Границы пересечения интервалов : " + intersection.getFrom() + " и " + intersection.getTo());
            System.out.println();
        }

        Range[] union = Range.getUnion(range1, range2);
        System.out.println("Объединение интервалов : " + union[0].getFrom() + " и " + union[0].getTo());

        Range[] difference = Range.getDifference(range1, range2);
        System.out.println("Разность интервалов : " + difference[0].getFrom() + " и " + difference[0].getTo());
    }
}

import ru.nikita.mishnev.range.Range;

public class Main {
    public static void main(String[] args) {
        Range range1 = new Range(3, 7);

        Range range2 = new Range(3, 5);

        Range range3 = Range.getIntersection(range1, range2);

        /*if (range3 != null) {
            System.out.println("from = " + range3.getFrom() + System.lineSeparator() + "to = " + range3.getTo());
        } else {
            System.out.println("Диапазоны не пересекаются.");
        }*/

        Range[] range4 = Range.getUnion(range1, range2);

        System.out.println("from = " + range4[0].getFrom() + System.lineSeparator() + "to = " + range4[0].getTo());
    }
}

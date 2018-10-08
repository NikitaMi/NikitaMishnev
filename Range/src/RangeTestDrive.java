import ru.nikita.mishnev.range.Range;

public class RangeTestDrive {
    public static void main(String[] args) {
        Range range1 = new Range(5, 9);
        Range range2 = new Range(2, 7);

        Range[] ranges = Range.getUnion(range1, range2);

        System.out.println("from = " + ranges[0].getFrom());
        System.out.println("to = " + ranges[0].getTo());
        System.out.println();
        //System.out.println("from = " + ranges[1].getFrom());
        //System.out.println("to = " + ranges[1].getTo());
















        //Range range3 = Range.getIntersection(range1, range2);

        /*if (range3 != null) {
            System.out.println("from = " + range3.getFrom());
            System.out.println("to = " + range3.getTo());
        } else {
            System.out.println("Пересечения нет.");
        }*/
    }
}

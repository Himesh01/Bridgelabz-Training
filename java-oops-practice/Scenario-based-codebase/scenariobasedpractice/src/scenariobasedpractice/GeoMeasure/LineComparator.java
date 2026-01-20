package scenariobasedpractice.GeoMeasure;

public class LineComparator {
	public static void compareLines(Line l1, Line l2) {
        double len1 = l1.getLength();
        double len2 = l2.getLength();

        System.out.printf("Line 1 Length: %.2f%n", len1);
        System.out.printf("Line 2 Length: %.2f%n", len2);

        if (len1 == len2) {
            System.out.println("Both lines are of equal length.");
        } else if (len1 > len2) {
            System.out.println("Line 1 is longer than Line 2.");
        } else {
            System.out.println("Line 2 is longer than Line 1.");
        }
        System.out.println("--------------------------------");
    }
}

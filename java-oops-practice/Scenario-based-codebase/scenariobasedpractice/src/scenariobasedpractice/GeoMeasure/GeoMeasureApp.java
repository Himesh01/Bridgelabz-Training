package scenariobasedpractice.GeoMeasure;
import java.util.*;

public class GeoMeasureApp {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Line[]> comparisons = new ArrayList<>();

        System.out.print("Enter number of line comparisons: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nComparison " + i);

            System.out.print("Enter x1 y1 x2 y2 for Line 1: ");
            Line l1 = new Line(sc.nextInt(), sc.nextInt(),
                               sc.nextInt(), sc.nextInt());

            System.out.print("Enter x1 y1 x2 y2 for Line 2: ");
            Line l2 = new Line(sc.nextInt(), sc.nextInt(),
                               sc.nextInt(), sc.nextInt());

            comparisons.add(new Line[]{l1, l2});
        }

        System.out.println("\n--- Line Comparison Results ---");
        for (Line[] pair : comparisons) {
            LineComparator.compareLines(pair[0], pair[1]);
        }

        sc.close();
    }
}

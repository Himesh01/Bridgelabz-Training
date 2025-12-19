import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i]);

            System.out.print("Enter age ");
            age[i] = sc.nextInt();

            System.out.print("Enter height ");
            height[i] = sc.nextDouble();
        }
        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }
        System.out.println("\nResults:");
        System.out.println("Youngest Friend: " + names[youngestIndex] +" (Age: " + age[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + names[tallestIndex] +" (Height: " + height[tallestIndex] + " cm)");
    }
}

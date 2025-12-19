import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        int count = 0;

        while (count < arr.length) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();
            if (num == 0.0) {
                break;
            }
            arr[count] = num;
            count++;
        }
        double sum = 0;
        for (double i : arr) {
            sum += i;
        }
        System.out.println("Total sum of numbers is: " + sum);
    }
}

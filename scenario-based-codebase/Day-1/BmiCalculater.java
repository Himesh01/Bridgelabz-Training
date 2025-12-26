import java.util.Scanner;

public class BmiCalculater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double weightKg = input.nextDouble();

        System.out.print("Enter height in meters (e.g., 1.75): ");
        double heightMeters = input.nextDouble();

        double bmi = weightKg / (heightMeters * heightMeters);

        System.out.printf("Your BMI is: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Category: Normal weight");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }

        input.close();
    }
}

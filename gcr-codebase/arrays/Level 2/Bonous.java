import java.util.Scanner;

public class Bonous{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter data " + (i + 1));

            double empSalary = -1;
            while (empSalary <= 0) {
                System.out.print("Enter salary : ");
                empSalary = scanner.nextDouble();
                if (empSalary <= 0) {
                    System.out.println("Invalid salary. enter a positive value.");
                }
            }
            salary[i] = empSalary;

            double empYearsOfService = -1;
            while (empYearsOfService < 0) {
                System.out.print("Enter years of service : ");
                empYearsOfService = scanner.nextDouble();
                if (empYearsOfService < 0) {
                    System.out.println("Invalid input. ");
                }
            }
            yearsOfService[i] = empYearsOfService;

            totalOldSalary += salary[i];
        }

        for (int i = 0; i < 10; i++) {
            double bonusPercentage = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonus[i] = salary[i] * bonusPercentage;
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nSummary of the employee bonuses and salaries:");
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("Old Salary: " + salary[i]);
            System.out.println("Years of Service: " + yearsOfService[i]);
            System.out.println("Bonus: " + bonus[i]);
            System.out.println("New Salary: " + newSalary[i]);
            System.out.println();
        }
    }
}

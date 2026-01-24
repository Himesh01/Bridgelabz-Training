package exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int num = sc.nextInt();

            System.out.print("Enter denominator: ");
            int den = sc.nextInt();

            int result = num / den;
            System.out.println("Result: " + result);

        } 
        catch (ArithmeticException e) {
			System.out.println("Exception handled: " + e.getClass().getName());
            System.out.println("Error: Cannot divide by zero.");
        } 
        catch (InputMismatchException e) {
			System.out.println("Exception handled: " + e.getClass().getName());
            System.out.println("Error: Please enter only numeric values.");
        } 
        finally {
            sc.close();
        }
    }
}
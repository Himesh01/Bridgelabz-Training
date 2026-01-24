package exception;

import java.util.Scanner;

public class FinnalyBlockExecution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
        	System.out.println("Exception handled :" + e.getClass().getName());
            System.out.println("Error: Cannot divide by zero.");
        } 
        finally {
            System.out.println("Operation completed");
            sc.close();
        }
    }
}
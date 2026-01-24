package exception;
import java.util.*;

public class NestedtryCatchBlock {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        try { 

            int value = arr[index];

            try {  
                int result = value / divisor;
                System.out.println("Result: " + result);
            } 
            catch (ArithmeticException e) {
            	System.out.println("Exception handled : "+ e.getClass().getName());
                System.out.println("Cannot divide by zero!");
            }

        } 
        catch (ArrayIndexOutOfBoundsException e) {
        	System.out.println("Exception handled : "+ e.getClass().getName());
            System.out.println("Invalid array index!");
        } 
        finally {
            sc.close();
        }
    }
}
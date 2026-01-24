package exception;
import java.util.*;

public class MultipleCatchBlock {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Index :");
        int index = sc.nextInt();   // change index or set arr = null to test

        try {
            int value = arr[index];
            System.out.println("Value at index " + index + ": " + value);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Handled: " + e.getClass().getName());
            System.out.println("Invalid index!");
        }
        catch (NullPointerException e) {
            System.out.println("Exception Handled: " + e.getClass().getName());
            System.out.println("Array is not initialized!");
        }
    }
}

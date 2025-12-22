import java.util.Scanner;

public class IllegalArgExcep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        try {
            illegalExc(s);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void illegalExc(String str) throws IllegalArgumentException {
        int startIndex = 5;
        int endIndex = 4;

        try {
            String result = str.substring(startIndex, endIndex);
            System.out.println("Substring result: " + result);
        } catch (StringIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Start index is greater than end index for substring");
        }
    }
}


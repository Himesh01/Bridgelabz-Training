import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
        String s = sc.nextLine();
		
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (result.indexOf(currentChar) == -1) {
                result += currentChar;
            }
        }

        System.out.println("Result: " + result);
    }
}		
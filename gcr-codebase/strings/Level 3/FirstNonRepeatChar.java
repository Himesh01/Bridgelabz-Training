import java.util.*;

public class FirstNonRepeatChar{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        char result = findFirstNonRepeating(s);

        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
		
    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeating(String str) {
        int[] frequency = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            frequency[currentChar]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (frequency[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return '\0';
    }
}
		
import java.util.Scanner;

public class StringTrim{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = scanner.nextLine();

        int[] trimmedIndexes = trimSpacesUsingCharAt(s);
        String trimUsingCharAt = substringUsingCharAt(s, trimmedIndexes[0], trimmedIndexes[1]);

        String trimUsingBuiltIn = s.trim();

        boolean areEqual = compareStringsUsingCharAt(trimUsingCharAt, trimUsingBuiltIn);

        System.out.println("Trimmed string (using charAt()): \"" + trimUsingCharAt + "\"");
        System.out.println("Trimmed string (using trim()): \"" + trimUsingBuiltIn + "\"");
        System.out.println("Are the trimmed strings equal? " + areEqual);
    }
	
    // Method to trim leading and trailing spaces using the charAt() method
    public static int[] trimSpacesUsingCharAt(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }
	
	// Method to create a substring using charAt() method 
    public static String substringUsingCharAt(String str, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt() method
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

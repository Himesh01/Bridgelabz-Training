import java.util.*;

public class UniqueChar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        char[] uniqueChars = findUniqueCharacters(s);

        displayUnChar(uniqueChars);
    }
	
    // Method to find the length of the string without using the length() method
    public static int getLength(String str) {
        int length = 0;
        while (true) {
            try {
                str.charAt(length);
                length++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return length;
    }

    // Method to find unique characters in a string using the charAt() method
    public static char[] findUniqueCharacters(String str) {
        int length = getLength(str);
        char[] uniqueChars = new char[length];
        int index = 0;
        
        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (currentChar == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[index] = currentChar;
                index++;
            }
        }

        char[] result = new char[index];
        System.arraycopy(uniqueChars, 0, result, 0, index);
        return result;
    }

    // Method to display the unique characters
    public static void displayUnChar(char[] uniqueChars) {
        System.out.println("Unique characters in the string:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}

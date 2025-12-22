import java.util.*;
public class ReturnCharacter{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Strings");
		String s = sc.next();
		
		char[] userDefinedChars = stringToCharArrayManual(s);

        char[] builtInChars = s.toCharArray();

        boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);

        System.out.println("User-defined method result: " + Arrays.toString(userDefinedChars));
        System.out.println("Built-in toCharArray() result: " + Arrays.toString(builtInChars));

        if (areEqual) {
            System.out.println("Comparison result: The two arrays are Same.");
        } else {
            System.out.println("Comparison result: The two arrays are different.");
        }
    }
	//method to return the characters in a string
    public static char[] stringToCharArrayManual(String str) {
        char[] charArray = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }

        return charArray;
    }
	
	// method to compare two string arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
}

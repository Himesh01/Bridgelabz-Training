/*Write a program to find the frequency of characters in a string using unique characters and display the result
Hint => 
Create a method to Find unique characters in a string using the charAt() method and return them as a 1D array.
  Use Nested Loops to find the unique characters in the text
Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 2D array.
 The logic used here is as follows:
Create an array to store the frequency of characters in the text.
 ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Call the uniqueCharacters() method to find the unique characters in the text
Create a 2D String array to store the unique characters and their frequencies. 
Loop through the unique characters and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result. 

*/
import java.util.*;

public class FrequencyOfChar2{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		
        String[][] results = getFrequency(s);

        System.out.println("\nCharacter | Frequency");
        for (int i = 0; i < results.length; i++) {
            System.out.println("    " + results[i][0] + "     |    " + results[i][1]);
        }
        sc.close();
    }

    // Method to find unique characters using nested loops
    public static char[] uniqueChar(String text) {
        String uniqueStr = "";
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean alreadyPresent = false;
            
            for (int j = 0; j < uniqueStr.length(); j++) {
                if (uniqueStr.charAt(j) == current) {
                    alreadyPresent = true;
                    break;
                }
            }
            if (!alreadyPresent) {
                uniqueStr += current;
            }
        }
        return uniqueStr.toCharArray();
    }
	
    // Method to find frequencies and return characters + counts in a 2D array
    public static String[][] getFrequency(String text) {
        int[] freqArr = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freqArr[ch]++;
        }
		
        char[] uniqueChars = uniqueChar(text);

        String[][] storage = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            storage[i][0] = String.valueOf(ch);
            storage[i][1] = String.valueOf(freqArr[ch]);
        }
        return storage;
    }
}
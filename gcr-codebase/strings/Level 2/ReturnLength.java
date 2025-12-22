/*Write a program to find and return the length of a string without using the length() method 
Hint => 
Take user input using the Scanner next() method 
Create a method to find and return a string's length without using the built-in length() method.
 The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception,
 handles the exception, and then return the count
The main function calls the user-defined method as well as the built-in length() method and displays the result

*/
import java.util.*;

public class ReturnLength{
	public static void main(String[] args){
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		
		String s = sc.next();
        int bInLength = s.length();

        int cLength = StringLen(s);

        System.out.println("Length using built-in length() method: " + bInLength);
        System.out.println("Length using custom method: " + cLength);
        
        sc.close();
    }
    // Method to find length of string without using length() method
    public static int StringLen(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
}

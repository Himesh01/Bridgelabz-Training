/*Write a program to demonstrate ArrayIndexOutOfBoundsException
Hint => 
Define a variable of array of names and take input from the user
Write a Method to generate the Exception. Here access index larger then the length of the array. 
This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access index larger then the length of the array.
 This will generate a runtime exception. Use the try-catch block to handle the ArrayIndexOutOfBoundsException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/

import java.util.*;

public class ArrayIndExp{
	public static void main(String args[]){
		
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		try{
			raiseArray(arr, n);
		}
		catch( ArrayIndexOutOfBoundsException e){
			System.out.println("Exception occured: "+e.toString());
		}
	}
	public static void raiseArray(int arr[], int size) throws ArrayIndexOutOfBoundsException{
		int x= arr[size];
	}
}
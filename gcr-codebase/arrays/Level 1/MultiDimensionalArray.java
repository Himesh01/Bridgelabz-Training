/*Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array
Hint => 
Take user input for rows and columns, create a 2D array (Matrix), and take the user input 
Copy the elements of the matrix to a 1D array. For this create a 1D array of size rows*columns as in int[] array = new int[rows * columns];
Define the index variable and Loop through the 2D array. Copy every element of the 2D array into the 1D array and increment the index
Note: For looping through the 2D array, you will need Nested for loop, Outer for loop for rows, and the inner for loops to access each element

*/
import java.util.Scanner;

public class MultiDimensionalArray{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter rows");
		int rows = sc.nextInt();
		System.out.println("Enter column");
		int col = sc.nextInt();
		
		int[][] matrix = new int[rows][col];
		
		for(int i= 0; i<rows;i++){
			for(int j=0; j<col;j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		int[] arr = new int[rows * col];
		int index =0;
		
		for(int i= 0; i<rows;i++){
			for(int j =0 ;j<col;j++){
				arr[index] = matrix[i][j];
				index++;
			}
		}
		System.out.print("One Dimensional Array");
		for(int k =0; k < arr.length; k++){
			System.out.print( arr[k]+ " ");
		}
		System.out.println();
	}
}
		
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
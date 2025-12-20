import java.util.*;

public class RemainderAndQuotient{
	public static void main(String[] args){
	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter numbers");
	 
	 int num1 = sc.nextInt();
	 int num2 = sc.nextInt();
	 
	 int[] ans = findRemainderAndQuotient(num1, num2);
	 System.out.println(Arrays.toString(ans));
	 
	 }
	 
	//method for printing quotient and reminder of a number
	public static int[] findRemainderAndQuotient(int number, int divisor){
		int quotient = number/divisor;
		int remainder = number% divisor;
		int[] arr = new int[2];
		arr[0] = quotient;
		arr[1] = remainder;
		return arr;
	}
}
	 
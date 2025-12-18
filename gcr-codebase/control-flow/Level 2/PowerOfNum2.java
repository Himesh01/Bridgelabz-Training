/*Rewrite the above program to find the power of a number using a while loop.
Hint => 
Get integer input for two variables named number and power.
Create a result variable with an initial value of 1.
Create a temp variable counter and initialize to zero. Use the while loop till _**counter == power**_.
In each iteration of the loop, multiply the result by the number and assign the value to the result. Also, increment the counter.
Finally, print the result

*/
import java.util.Scanner;

public class PowerOfNum2{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int power = sc.nextInt();
		int result =1;
		
		if(number <= 0 || power <=0){
			System.out.println("Invalid Numbers");
		}
		else{
			int temp = 1;
			while(temp <= power){
				result = number * result;
				temp++;
			}
			System.out.println(result);
		}
	}
}
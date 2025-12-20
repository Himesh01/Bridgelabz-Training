
import java.util.*;

public class MaxHandshakes{
	public static void main(String[]args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of students");
	int number = sc.nextInt();
	int max = handshakes(number);
	System.out.println("The number of possible handshakes "+ max);
	}
	public static int handshakes(int n){
		return (n * (n - 1)) / 2;
	}
}
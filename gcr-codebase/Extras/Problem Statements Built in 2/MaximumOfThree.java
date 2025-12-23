import java.util.*;

public class MaximumOfThree{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		input(sc);
	}
	public static void input(Scanner sc){
		System.out.println("Enter first : ");
		int first = sc.nextInt();
		
		System.out.println("Enter Second : ");
		int second = sc.nextInt();
		
		System.out.println("Enter Third : ");
		int third = sc.nextInt();
		
		max(first,second,third);
	}
	public static void max(int f,int s, int t){
		if(f>s&&f>t){
			System.out.println("Maximum number is "+f);
			return;
		}
		if(s>f&&s>t){
			System.out.println("Maximum number is "+s);
			return;
		}
			System.out.println("Maximum number is "+t);
			return;
	}
}
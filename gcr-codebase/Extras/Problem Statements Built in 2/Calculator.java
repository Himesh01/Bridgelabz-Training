import java.util.*;

public class Calculator{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number 1: ");
		int first = sc.nextInt();
		
		System.out.println("Enter a number 2: ");
		int second = sc.nextInt();
		
		System.out.println("Enter operation : ");
		char op = sc.next().charAt(0);
		
		System.out.println("The answer is : "+cal(first,second,op));
	}
	public static double cal(int f, int s,char op){
		switch(op){
			case '+':
			    return f+s;
			case '-':
			   return f-s;
			case '*':
			    return f*s;
			case '/':
			    return f/s;
			default:
			   return 0;
		}
	}
}
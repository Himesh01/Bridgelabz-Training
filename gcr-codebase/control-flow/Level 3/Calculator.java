import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1");
        double num1 = sc.nextDouble();
		
		System.out.println("Enter num2");
		double num2 = sc.nextDouble();
		
		System.out.println("Enter Operation");
		String op = sc.next();
		
		double result;
		switch(op){
			case"+":
			result = num1 + num2;
			System.out.println("Result: "+ result);
			break;
			case"-":
			result = num1 - num2;
			System.out.println("Result: "+ result);
			break;
			case"*":
			result = num1 * num2;
			System.out.println("Result: "+ result);
			break;
			case"/":
			result = num1 / num2;
			System.out.println("Result: "+ result);
			break;
			default:
			System.out.println("Invalid Operator");
		}
	}
}
			
			
		
		
		
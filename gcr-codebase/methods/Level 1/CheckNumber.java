import java.util.*;

public class CheckNumber{
	public static void main(String[]args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int n = sc.nextInt();
	int check = number(n);
	if(check == 1){
		System.out.println("Positive");
	}else if(check == 0){
		System.out.println("Zero");
	}else{
		System.out.println("Negative");
	}
	}
	public static int number(int n){
		if(n>0)
			return 1;
		else if(n<0)
			return -1;
		else{
			return 0;
		}
	}
}
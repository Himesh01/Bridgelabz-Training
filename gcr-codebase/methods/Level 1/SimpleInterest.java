import java.util.*;

public class SimpleInterest{
	public static void main(String[]args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Principal");
	int principal = sc.nextInt();
	
	System.out.println("Enter rate");
	int rate = sc.nextInt();
	
	System.out.println("Enter time");
	int time = sc.nextInt();
	
	int si = calculate(principal,rate,time);
	System.out.println("The Simple Interest is "+ si +" for Principal "+ principal +", Rate of Interest "+ rate + " and Time "+ time );
	}
	public static int calculate(int p, int r, int t){
		return (p*r*t)/100;
	}	
}
	
	
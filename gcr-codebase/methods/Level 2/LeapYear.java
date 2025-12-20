import java.util.*;
public class LeapYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year ");
		int n = sc.nextInt();
		
		isLeap(n);
	}
	public static void isLeap(int n){
		if(n>=1582){
			if((n%400==0)||((n%4==0)&&(n%100!=0))){
				System.out.println("It is a leap year");
			}else{
				System.out.println("It is not a leap year");
			}
		}else{
			System.out.println("It is not a leap year");
		}
	}
}
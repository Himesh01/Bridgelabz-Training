import java.util.*;
public class Numberfind{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		
		for(int i=0;i<5;i++){
			arr[i]= sc.nextInt();
		}
		for(int a: arr){
			isPositive(a);
		}
	}
	public static void isPositive(int a){
		if(a>=0){
			isEven(a);
		}else{
			System.out.println("The number is negative");
		}
	}
	public static void isEven(int a){
		if(a%2==0){
			System.out.println("The number is Even");
		}else{
			System.out.println("The number is Odd");
		}
	}
}
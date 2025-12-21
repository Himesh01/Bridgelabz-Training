import java.util.*;

public class NumberCheck4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		if(isPrime(n)){
			System.out.println("The number is a Prime ");
		}else{
				System.out.println("The number is not a Prime number ");
		}
		if(isNeon(n)){
			System.out.println("The number is a neon number ");
		}else{
				System.out.println("The number is not neon number ");
		}
		if(isSpy(n)){
			System.out.println("The number is Spy number ");
		}else{
				System.out.println("The number is not Spy number ");
		}
		if(isAutomorphic(n)){
			System.out.println("The number is automorphic number ");
		}else{
				System.out.println("The number is not automorphic number ");
		}
		if(isBuzz(n)){
			System.out.println("The number is Buzz number ");
		}else{
				System.out.println("The number is not Buzz number ");
		}
	}
	
	//Method to Check if a number is prime number
	public static boolean isPrime(int a){
		for(int i =2;i<a;i++){
			if(a%i==0){
				return false;
			}
		}
		return true;
	}
	
	//Method to Check if a number is a neon number
	public static boolean isNeon(int a){
		int sq = a*a;
		int sum =0;
		while(sq!=0){
			sum+=sq%10;
			sq/=10;
		}
		return sum==a?true:false;
	}
	
	//Method to Check if a number is a spy number
	public static boolean isSpy(int a){
		int sum =0;
		int product =1;
		while(a!=0){
			sum+=a%10;
			product*=a%10;
			a/=10;
		}
		return sum==product?true:false;
	}
	
	//Method to Check if a number is an automorphic number
	public static boolean isAutomorphic(int a){
		int sq = a*a;
		int rev =0;
		while(a!=0){
			rev = (rev*10)+(a%10);
			a/=10;
		}
		int sum =0;
		while(sq!=0){
			sum =(sum*10)+(sq%10);
			sq/=10;
			if(sum==rev){
				return true;
			}
		}
		return false;
	}
	
	//Method to Check if a number is a buzz number
	public static boolean isBuzz(int a){
		return ((a%7==0)||(a%10==7))?true:false;
	}
}
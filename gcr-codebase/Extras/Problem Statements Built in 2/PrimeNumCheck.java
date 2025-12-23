import java.util.*;
public class PrimeNumCheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		System.out.println("The number is Prime : "+isPrime(n));
	}
	public static boolean isPrime(int n){
		if(n<2){
			return false;
		}
		for(int i =2;i<n;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}
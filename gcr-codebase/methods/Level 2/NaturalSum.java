import java.util.*;

import java.util.*;
public class NaturalSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("The sum of n natural number by formula is "+formula(n));
		System.out.println("The sum of n natural number by recursion is "+recursion(n));
	}
	public static int formula(int n){
		return (n*(n+1))/2;
	}
	public static int recursion(int n){
		if(n<=0){
			return 0;
		}
		return recursion(n-1)+n;
	}
}
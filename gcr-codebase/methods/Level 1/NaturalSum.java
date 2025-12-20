import java.util.*;

public class NaturalSum{
	public static void main(String[] args){
	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number");
	 int n = sc.nextInt();
	 int ans  = sumNatural(n);
	 System.out.println("the sum of n natural numbers " +ans);
	 }
	 public static int sumNatural(int n){
	 int sum =0;
		for(int i =0; i<=n; i++)
			sum = sum+i;
		return sum;
	}
}
	 
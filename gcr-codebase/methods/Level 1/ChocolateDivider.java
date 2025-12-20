import java.util.*;
public class ChocolateDivider{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the total number of chocolates : ");
		int n = sc.nextInt();
		
		System.out.print("Enter the number of children (M): ");
		int m = sc.nextInt();
		
		int [] arr = findRemainderAndQuotient(n,m);
		
		System.out.println("each student get "+arr[1]+" the remaining is "+arr[0]);
	}
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int [] ans = new int[2];
		ans[0] = number%divisor;
		ans[1] = number/divisor;
		
		return ans;
	}

}
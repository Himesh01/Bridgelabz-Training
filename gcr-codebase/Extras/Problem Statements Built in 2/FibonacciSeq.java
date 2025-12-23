import java.util.*;

public class FibonacciSeq{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		
		
		System.out.println(Arrays.toString(fibonacci(n)));
	}
	
	public static int[] fibonacci(int idx){
		int [] arr = new int[idx+1];
		 arr[0]=0;
		 arr[1]=1;
		 for(int i =2;i<=idx;i++){
			 arr[i] = arr[i-1]+arr[i-2];
		 }
		 return arr;
	}
}
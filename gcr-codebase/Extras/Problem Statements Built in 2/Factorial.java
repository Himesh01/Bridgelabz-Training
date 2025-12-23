import java.util.*;

public class Factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println(Arrays.toString(input(sc)));
	}
	
	public static int[] input(Scanner sc){
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int[] arr = new int [count(n,1)];
		return fact(arr,n,1,0);
	}
	public static int count (int n,int i){
		if(i==n){
			return 0;
		}
		if(n%i==0){
			return count(n,i+1)+1;
		}
		return count(n,i+1);
	}
	public static int[] fact(int[] arr, int n, int i, int idx){
		if(i==n){
			return arr;
		}
		if(n%i==0){
			arr[idx]=i;
			return fact(arr,n,i+1,idx+1);
		}
		return fact(arr,n,i+1,idx);
	}
}
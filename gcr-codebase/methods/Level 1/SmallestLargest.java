import java.util.*;

public class SmallestLargest{
	public static void main(String[] args){
	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter numbers");
	 
	 int num1 = sc.nextInt();
	 int num2 = sc.nextInt();
	 int num3 = sc.nextInt();
	 int[] sum = number(num1,num2,num3);
	 System.out.println(Arrays.toString(sum));
	 
	 }
	 
	 //method for finding smallest and largest numbers
	 public static int[] number(int a, int b, int c){
		int min = Math.min(a,(Math.min(b,c)));
		int max = Math.max(a,(Math.max(b,c)));
		int[] arr = new int[2];
		arr[0] = max;
		arr[1] = min;
		return arr;
	}
}
	 
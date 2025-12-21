import java.util.*;

public class Number1{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n= sc.nextInt();
		
		int size = count(n);
		int[] arr = store(n,size);
		largestAndSecond(arr);
		smallestAndSecond(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println("The number is digit is "+size);
		if(checkDuck(n)){
			System.out.println("The number is duck number ");
		}else{
				System.out.println("The number is not duck number ");
		}
			if(armstrong(n,size)){
			System.out.println("The number is Armstrong number ");
		}else{
				System.out.println("The number is not Armstrong number ");
		}
	}
	
	//method to count digits in a number
	public static int count(int a){
		int len = 0;
		while(a!=0){
			len++;
			a/=10;
		}
		return len;
	}
	
	//Method to check if the number is a armstrong number using the digits array.
	public static int[] store(int a, int size){
		int[] arr = new int[size];
		while(a!=0){
			arr[size-1] = a%10;
			a/=10;
			size--;
		}
		return arr;
	}
	
	//method to find check Duck number
	 public static boolean checkDuck(int a){
		 while(a!=0){
			 int n = a%10;
			 if(n==0){
				 return false;
			 }
			 a/=10;
		 }
		 return true;
	 }
	 
	 //method to find Armstrong number
	 public static boolean armstrong(int a, int size){
		 int temp =a;
		 int sum =0;
		 while(temp!=0){
			 sum +=Math.pow((temp%10),size);
			 temp/=10;
		 }
		 return sum==a?true:false;
	 }
	 
	 //method to find Lergest and Second Largest elements
	 public static void largestAndSecond(int[] arr){
		 int [] ans = new int[2];
		 Arrays.fill(ans,Integer.MIN_VALUE);
		 for(int a: arr){
			 if(a>ans[0]){
				 ans[1] = ans[0];
				 ans[0] = a;
			 }else if(a>ans[1]&&a!=ans[0]){
				 ans[1] = a;
			 }
		 }
		 System.out.println("The largest digit is "+ans[0]);
		 System.out.println("The second largest digit is "+ans[1]);
	 }
	 
	 //method to find Smallest and largest elements
	 public static void smallestAndSecond(int[] arr){
		  int [] ans = new int[2];
		 Arrays.fill(ans,Integer.MAX_VALUE);
		 for(int a: arr){
			 if(a<ans[0]){
				 ans[1] = ans[0];
				 ans[0] = a;
			 }else if(a<ans[1]&&a!=ans[0]){
				 ans[1] = a;
			 }
		 }
		 System.out.println("The smallest digit is "+ans[0]);
		 System.out.println("The second smallest digit is "+ans[1]);
	 }
}
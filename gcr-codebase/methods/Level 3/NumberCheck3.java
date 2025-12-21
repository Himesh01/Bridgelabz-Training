import java.util.*;
public class NumberCheck3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		int n = sc.nextInt();
		
		int size = count(n);
        int[] arr = store(n,size);
		int [] rev = reverse(arr);
		
        System.out.println("The number of digit is "+size);
        System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(rev));
		
		compare(arr,rev);
		if(duck(arr)){
			System.out.println("The number is duck number ");
		}else{
				System.out.println("The number is not duck number ");
		}
		if(palindrome(n)){
			System.out.println("The number is Palindromic number ");
		}else{
				System.out.println("The number is not Palindromic number ");
		}
	}
	
	//method to count digits in a number
	public static int count(int a){
		int len =0;
		while(a!=0){
			len++;
			a/=10;
		}
		return len;
	}
	
	 //Method to Store the digits of the number in a digits array
	public static int[] store(int a, int size){
		int [] arr = new int [size];
		while(a!=0){
			arr[size-1]=a%10;
			a/=10;
			size--;
		}
		return arr;
	}
	
	//Method to Check if a number is a duck number using the digits array
	public static boolean duck(int [] arr){
		for(int a:arr){
			if(a==0){
				return false;
			}
		}
		return true;
	}
	
	//Method to reverse the digits array
	public static int[] reverse(int [] arr){
		int [] rev = new int[arr.length];
		int len = arr.length-1;
		for(int a:arr){
			rev[len--] = a;
		}
		return rev;
	}
	
	//Method to compare two arrays and check if they are equal
	public static void compare(int [] arr, int[] rev){
		 System.out.println("arr equals to rev: " +Arrays.equals(arr, rev));
	}
	
	//Method to check if a number is a palindrome using the Digits
	public static boolean palindrome(int n){
		int rev =0;
		int temp = n;
		while(temp!=0){
			rev=(rev*10)+(temp%10);
			temp/=10;
		}
		return n==rev?true:false;
	}
}
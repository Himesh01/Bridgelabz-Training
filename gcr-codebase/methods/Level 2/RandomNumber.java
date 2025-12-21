import java.util.*;
public class RandomNumber{
	public static void main(String[] args){
		int [] arr = generate4DigitRandomArray(4);
		System.out.println(Arrays.toString(arr));
		maxDigit(arr);
		minDigit(arr);
		average(arr);
	}

	public static int[] generate4DigitRandomArray(int size){
		Random r = new Random();
		int random = r.nextInt(9000) + 1000;
		int [] arr = new int[size];
		while(random!=0){
			arr[size-1]= random%10;
			random/=10;
			size--;
		}
		return arr;
	}
    public static void minDigit(int[] arr){
		int min = arr[0];
		for(int a:arr){
			min=Math.min(a,min);
		}
		System.out.println("The minimum digit is "+min);
	}
	public static void maxDigit(int[] arr){
		int max = arr[0];
		for(int a : arr){
			max =Math.max(a,max);
		}
		System.out.println("The maximum digit is "+max);
	}
	public static void average(int[] arr){
		int sum= 0;
		for(int a : arr){
			sum+=a;
		}
		System.out.println("The Average of digit is "+(sum/4));
	}
}
import java.util.*;

public class DigitFrequency{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a number: ");
		int n = sc.nextInt();
		
		int arr[] = new int[10];
		while(n>0){
			arr[n%10]+=1;
			n/=10;
		}
		
		System.out.println("Frequecy of digits are: ");
		for(int i=0;i<10;i++)
			if(arr[i]!=0)
				System.out.println(i+" appears "+arr[i]+" times");
	}
}
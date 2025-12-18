import java.util.Scanner;

public class CompareNaturalForLoop{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int a =n;
		for(int i = n ;i >=0;i--){
			sum += i;
		}
		System.out.println(sum);
		int sum1 = 0;
		sum1 = a * (a+1) / 2 ;
		System.out.println(sum1);
	}
}
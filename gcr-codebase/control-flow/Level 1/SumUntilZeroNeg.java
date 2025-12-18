import java.util.Scanner;

public class SumUntilZeroNeg{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		double total =0.0;
		int number;
		number = sc.nextInt();
		while(number > 0){
			number = sc.nextInt();
			if(number <=0){
				break;
			}
			total += number;
		}
		System.out.println(total);
	}
}

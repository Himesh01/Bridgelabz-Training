import java.util.Scanner;

public class SumUntilZero{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		double total =0.0;
		int number;
		number = sc.nextInt();
		while(number !=0){
			number = sc.nextInt();
			total += number;
		}
		System.out.println(total);
	}
}

		
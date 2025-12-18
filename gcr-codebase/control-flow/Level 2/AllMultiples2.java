
import java.util.Scanner;

public class AllMultiples2{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number <=0 || number >=100){
			System.out.println("Invalid Number");
		}
		else{
			int counter =99;
			while(counter >0){
				if(counter % number ==0){
				System.out.println(counter);
				}
				counter--;
			}
		}
	}
}
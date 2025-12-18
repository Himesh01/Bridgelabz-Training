
import java.util.Scanner;

public class PowerOfNum{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int power = sc.nextInt();
		int result =1;
		if(number <= 0 || power <=0){
			System.out.println("Invalid Numbers");
		}
		else{
			for(int i = 1; i<= power; i++){
				result = number * result;
			}
			System.out.println(result);
		}
	}
}
import java.util.Scanner;

public class FindFactorsWhileLoop{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number>0){
			int i =number-1;
			while(i>0){
				if(number%i==0){
					System.out.println(i);
				}
				i--;
			}
		}
	}
}
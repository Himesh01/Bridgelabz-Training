import java.util.Scanner;

public class AllMultiples{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number <=0 || number >=100){
			System.out.println("Invalid Number");
		}
		else{
			for(int i = 99; i>0;i--){
				if(i % number ==0){
				System.out.println(i);
				}
			}
		}
	}
}
				
import java.util.Scanner;

public class MultiplicationTable{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number >=6 && number <=9){
			for(int i = 1;i<=10;i++){
				int mul = number*i;
			System.out.println(number +" x "+i+"= "+mul);
			}
			System.out.println();
		}
	}
}
			
		
import java.util.Scanner;

public class DivideByFive {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int number;
	number = sc.nextInt();
	if(number%5 ==0){
		System.out.println("YES");
	}
	else{
		System.out.println("NO");
		}
	}
}	
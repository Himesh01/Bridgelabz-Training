import java.util.Scanner;

public class BonusOfEmp{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		int yofService = sc.nextInt();
		int bonus = 0;
		if(yofService >5){
			bonus = salary * 5/100;
		}
		System.out.println(salary + bonus);
	}
}

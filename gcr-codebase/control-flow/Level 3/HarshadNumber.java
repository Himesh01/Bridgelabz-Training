import java.util.Scanner;

public class HarshadNumber{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
		
		int sum = 0;
		int originalNum =number;
		
		while(originalNum !=0){
			int last = originalNum %10;
			sum = sum +last ;
			originalNum = originalNum /10;
		}
		if(number % sum ==0){
			System.out.println("Harshed Number");
		}
		else{
			System.out.println("Not a Harshed Number");
		}
	}
}
		
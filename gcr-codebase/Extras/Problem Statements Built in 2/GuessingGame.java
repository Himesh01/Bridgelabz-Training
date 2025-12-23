import java.util.*;

public class GuessingGame{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number between 1 to 100 :");
		int n = sc.nextInt();
		
		if(n>100||n<0){
			System.exit(0);
		}
		int com = computerGuess();
		whoWin(n,com);
	}
	
	public static int computerGuess(){
		Random r = new Random();
		int guess = r.nextInt(99)+1;
		return guess;
	}
	
	public static void whoWin(int u, int c){
		if(u==c){
			System.out.println("Computer wins your number is "+u+" and the number guess by computer is "+c);
			return;
		}
		System.out.println("You wins your number is "+u+" and the number guess by computer is "+c);		
	}
}
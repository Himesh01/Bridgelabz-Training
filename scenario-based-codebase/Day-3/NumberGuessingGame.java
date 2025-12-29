/*7. The Number Guessing Game 🎲
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries.
*/

import java.util.*;

public class NumberGuessingGame{
	public static void main(String[] args){
		
		Random random = new Random();
		
		int target = random.nextInt(100)+1;
		
		Scanner sc = new Scanner(System.in);
		int guess;
		int attempt =0;
		final int MAX_ATTEMPT = 5;
		boolean guessAns = false;
		
		System.out.println("Guess a number between 1 to 100");
		
		do{
			System.out.println("Enter a number you guess ");
			guess = sc.nextInt();
			attempt++;
			if(guess == target){
			guessAns = true;
			System.out.println("You Guessed correct number. ");
			}else if(guess < target){
				System.out.println("Too low! Try Again ");
			}else{
				System.out.println("Too High! Try Again");
			}
			
			if(!guessAns && attempt >= MAX_ATTEMPT){
				System.out.println("No attempts left ");
				System.out.println("Target number was : "+ target);
				break;
			}
		}
		while(!guessAns);
	}
}
			
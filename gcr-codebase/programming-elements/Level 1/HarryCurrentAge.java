//importing package
import java.util.Scanner;
// created class with neme HarryCurrentAge indicating the purpose is to display Age of Harry
class HarryCurrentAge{
	public static void main(String[] args){
		//creating Scanner class object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Birth Year");
		//Create a variable birthYear to take input of Birth year of Harry
		int birthYear = sc.nextInt();
		//Create a variable currentAge to indicate Harry's age in 2024
		int currentAge = 2024 -birthYear;
		//Display the result
		System.out.println("Harry's age in 2024 is " + currentAge);
	}
}
/*
17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.
*/
import java.util.*;

public class QuizApplication{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------------Online Quiz Application-----------------------------");
		
		String question[] = new String[5];
		String [][] options = new String[5][4];
				
		question[0] = "1) Which of the following is true about Java?";
		options[0][0] = "a) Java is a procedural language";
		options[0][1] = "b) Java is platform dependent";
		options[0][2] = "c) Java uses JVM to run code";
		options[0][3] = "d) Java does not support OOP";
		
		question[1] = "2) What does POJO stand for in programming?";
		options[1][0] = "a) Plain old java object";
		options[1][1]= "b) Popular old java object";
		options[1][2] = "c) Platform oriented java object";
		options[1][3] = "d) Primary object java object";
		
		question[2] ="3) Which data structure follows the FIFO (First In, First Out) principle?";
		options[2][0] = "a) Stack";
		options[2][1] = "b) Tree";
		options[2][2] = "c) Queue";
		options[2][3] = "d) Graph";
		
		question[3] = "4) Which symbol is used for single-line comments in Python?";
		options[3][0] = "a) //";
		options[3][1] = "b) /* */";
		options[3][2] = "c) #";
		options[3][3] = "d) --";
		
		question[4] = "5) What is a marker interface in Java?";
		options[4][0] = "a) An interface with only default methods";
		options[4][1] = "b) An interface with only static methods";
		options[4][2] = "c) An interface with no methods";
		options[4][3] = "d) An abstract class";
		
		char[] ans = {'c','a','c','c','c'};
		
		int marks=0;
		
		for(int i=0;i<5;i++){
			System.out.println(question[i]);
			for(int j=0;j<4;j++)
				System.out.println(options[i][j]);
			System.out.print("\nEnter your choice (a,b,c,d): ");
			char choice = sc.next().charAt(0);
			sc.nextLine();
			System.out.println();
			if(choice ==ans[i])
				marks++;
		}
		
		System.out.println("You obtained: "+marks+" marks");
	}
}
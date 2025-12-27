import java.util.Scanner;
	
public class ResultGenerator
{
    public static void main(String args[])
    {
	Scanner input = new Scanner(System.in);
	
	int[] marks = new int[5];
	int totalMarks = 0;
	
	for(int i=0; i<5; i++)
	{	
	    System.out.print("Enter Marks for Subject " + (i+1) + ": ");
	    marks[i] = input.nextInt();
	    totalMarks += marks[i];
	}
	
	int average = totalMarks/5;
	switch(average / 10)
	{
	    case 10:
	    case 9:
		System.out.println("Grade: A");
		break;
	    case 8:
		System.out.println("Grade: B");
		break;
	    case 7:
		System.out.println("Grade: C");
		break;
	    case 6:
		System.out.println("Grade: D");
		break;
	    default:
		System.out.println("Grade: F");
	}
	input.close();
    }	
}
import java.util.Scanner;

public class ElectionBoothManager
{
    public static void main(String args[])
    {
	Scanner input = new Scanner(System.in);
	int candidate1 = 0;
	int candidate2 = 0;
	int candidate3 = 0;
	
	while(true)
	{
	    int age;
	    System.out.print("Enter Age: or (-1 for exit) ");
	    age = input.nextInt();
	
	    if(age == -1)
	  	break;
		
	    if(age >= 18)
	    {
		System.out.println("Eligible to vote");
	  	System.out.println("Vote for Candidate (1 / 2 / 3)");
		int vote = input.nextInt();	
		
		if(vote == 1)
		    candidate1++;
		else if(vote == 2)
		    candidate2++;
		else if(vote == 3)
		    candidate3++;
		else
		    System.out.println("Invalid Candidate Number");
	    }
	    else
	    {
		System.out.println("Not Eligible for Vote");
	    }
	}
	
	System.out.println("Candidate-1 got " + (candidate1) + " Votes");
	System.out.println("Candidate-2 got " + (candidate2) + " Votes");
	System.out.println("Candidate-3 got " + (candidate3) + " Votes");
    }
}
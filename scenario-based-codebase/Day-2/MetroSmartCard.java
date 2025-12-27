import java.util.Scanner;

public class MetroSmartCard
{
    public static void main(String args[])
    {
	Scanner input = new Scanner(System.in);
	int balance = 100;
	
	while(true)
	{
	    int distance;
	    System.out.print("Enter Distance in km: ( or -1 for quit)");
	    distance = input.nextInt();
	
	    if(distance == -1)
		break;
	
    	    int fare = (distance <= 5) ? 10 : 20;
	
	    if(fare <= balance)
	    {
		balance -= fare;
		System.out.println("Your Fare is: " + fare);	
		System.out.println("Your Remaining Balance on Smart Card is: " + balance);
 	    }
	    else
	    {
		System.out.println("Insufficient balance ");
		break;
   	    }
	}
	input.close();
    }
}
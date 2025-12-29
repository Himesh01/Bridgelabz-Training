/*
10. Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.
*/
import java.util.Scanner;

public class MobilePhoneRecharge{
    public static void initializeMonth(int[] jioMonth, int[] viMonth, int[] airtelMonth)
    {
	jioMonth[0] = 199;
	viMonth[0] = 209;
	airtelMonth[0] = 219;

	jioMonth[1] = 249;
	viMonth[1] = 259;
	airtelMonth[1] = 265;

	jioMonth[2] = 299;
	viMonth[2] = 309;
	airtelMonth[2] = 319;
    }
     
    public static void initializeYear(int[] jioMonth, int[] viMonth, int[] airtelMonth)
    {
	jioMonth[0] = 2199;
	viMonth[0] = 2209;
	airtelMonth[0] = 2219;

	jioMonth[1] = 2349;
	viMonth[1] = 2359;
	airtelMonth[1] = 2365;

	jioMonth[2] = 2399;
	viMonth[2] = 2309;
	airtelMonth[2] = 2319;
    }

    public static void recharge()
    {
	int[] jioMonth = new int[3];
	int[] viMonth = new int[3];
	int[] airtelMonth = new int[3];

	int[] jioYear = new int[3];
	int[] viYear = new int[3];
	int[] airtelYear = new int[3];

	initializeMonth(jioMonth, viMonth, airtelMonth);
	initializeYear(jioYear, viYear, airtelYear);
	Scanner input = new Scanner(System.in);
	
	while(true)
	{
	    String user;
	    System.out.println("Enter Mobile Operator-> (Jio / Airtel / VI)  ");
	    System.out.println("-1 for Exit");
	    user = input.next();
	    int choice = Integer.parseInt(user);
	    if(choice == -1)
		break;
	    if(user.toLowerCase().equals("jio"))
	    {
		System.out.println("---------------- Welcome to Jio -----------");
		System.out.println("Monthly Plans: ----- (28 Days)");
		System.out.println(jioMonth[0] + "  --  1 gb");
		System.out.println(jioMonth[1] + "  --  1.5 gb");
		System.out.println(jioMonth[2] + "  --  2 gb");
		System.out.println("-------------------------------------------");
		System.out.println("Yearly Plans: ------ (365 Days)");
		System.out.println(jioYear[0] + "  --  1 gb");
		System.out.println(jioYear[1] + "  --  1.5 gb");
		System.out.println(jioYear[2] + "  --  2 gb");
	
		long mobileNumber = 0;
		System.out.println("Enter Phone Number: " + mobileNumber);
		mobileNumber = input.nextLong();
				

		int planPrice;
		System.out.println("Enter Plan Price: ");
		planPrice = input.nextInt();
	      	while(planPrice != jioMonth[0] && planPrice != jioMonth[1] && planPrice != jioMonth[2] && planPrice != jioYear[0] && planPrice != jioYear[1] && planPrice != jioYear[2])
		{
		    System.out.println("Invalid Plan, Enter Plan Price Again: ");
		    planPrice = input.nextInt();
		}	
		
		System.out.println("---------------------------------------------");
		System.out.println("Your Recharge is Successfull ");
		System.out.println("Your Plan: " + planPrice);
		System.out.println("---------------------------------------------");
	    }
	    else if(user.toLowerCase().equals("airtel"))
	    {
		System.out.println("---------------- Welcome to Airtel -----------");
		System.out.println("Monthly Plans: ----- (28 Days)");
		System.out.println(airtelMonth[0] + "  --  1 gb");
		System.out.println(airtelMonth[1] + "  --  1.5 gb");
		System.out.println(airtelMonth[2] + "  --  2 gb");
		System.out.println("-------------------------------------------");
		System.out.println("Yearly Plans: ------ (365 Days)");
		System.out.println(airtelYear[0] + "  --  1 gb");
		System.out.println(airtelYear[1] + "  --  1.5 gb");
		System.out.println(airtelYear[2] + "  -- 2 gb");

		long mobileNumber = 0;
		System.out.println("Enter Phone Number: " + mobileNumber);
		mobileNumber = input.nextLong();

		int planPrice;
		System.out.println("Enter Plan Price: ");
		planPrice = input.nextInt();
	      	while(planPrice != airtelMonth[0] && planPrice != airtelMonth[1] && planPrice != airtelMonth[2] && planPrice != airtelYear[0] && planPrice != airtelYear[1] && planPrice != airtelYear[2])
		{
		    System.out.println("Invalid Plan, Enter Plan Price Again: ");
		    planPrice = input.nextInt();
		}	
		
		System.out.println("---------------------------------------------");
		System.out.println("Your Recharge is Successfull ");
		System.out.println("Your Plan: " + planPrice);
		System.out.println("---------------------------------------------");

	    }
	    else if(user.toLowerCase().equals("vi"))
	    {
		System.out.println("---------------- Welcome to VI -----------");
		System.out.println("Monthly Plans: ----- (28 Days)");
		System.out.println(viMonth[0] + "  --  1 gb");
		System.out.println(viMonth[1] + "  --  1.5 gb");
		System.out.println(viMonth[2] + "  --  2 gb");
		System.out.println("-------------------------------------------");
		System.out.println("Yearly Plans: ------ (365 Days)");
		System.out.println(viYear[0] + "  --  1 gb");
		System.out.println(viYear[1] + "  --  1.5 gb");
		System.out.println(viYear[2] + "  --  2 gb");

		long mobileNumber = 0;
		System.out.println("Enter Phone Number: " + mobileNumber);
		mobileNumber = input.nextLong();
	
		int planPrice;
		System.out.println("Enter Plan Price: ");
		planPrice = input.nextInt();
	      	while(planPrice != viMonth[0] && planPrice != viMonth[1] && planPrice != viMonth[2] && planPrice != viYear[0] && planPrice != viYear[1] && planPrice != viYear[2])
		{
		    System.out.println("Invalid Plan, Enter Plan Price Again: ");
		    planPrice = input.nextInt();
		}	
		
		System.out.println("---------------------------------------------");
		System.out.println("Your Recharge is Successfull ");
		System.out.println("Your Plan: " + planPrice);
		System.out.println("---------------------------------------------");

	    } 
	    else
	    {
		System.out.println("Invalid Operator!!!!!!!!!");
	    }
		
	}
	input.close();
    }

    public static void main(String args[])
    {
	recharge();
    }
}
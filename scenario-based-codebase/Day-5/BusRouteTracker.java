/*
19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.
*/

import java.util.*;

public class BusRouteTracker{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int total =0;
		do{
			System.out.print("Enter next stop distance: ");
			int distance = sc.nextInt();
			total+=distance;
			
			System.out.print("Do you wany to go to next stop (y/n): ");
			char choice = sc.next().charAt(0);
			sc.nextLine();
			
			if(choice=='n' || choice=='N')
				break;
		}while(true);
		
		System.out.println("Total distance traveled by you: "+total);
	}
}
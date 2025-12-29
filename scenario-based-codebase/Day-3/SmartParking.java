/*6. Parking Lot Gate System 🚗
Develop a smart parking system.
● Options: Park, Exit, Show Occupancy
● Use switch-case for the menu.
● while loop to continue until the parking lot is full or the user exits.

*/
import java.util.*;
public class SmartParking{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = 50;
		
		while(true){
			System.out.println("1-Park, 2-Exit, 3-Show Occupancy");
            System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice){
				case 1:
					if(size >0){
					System.out.println("You can park!!");
					size  = size-1;
					}else{
						System.out.println("Parking lot is full.");
					}
					break;
				
				case 2:
					System.out.println("Exit Successfully!! ");
					System.exit(0);
					break;
					
				case 3:
					System.out.println("Current Space for parking is: " + size);
					System.out.println("Occupied spots: " + (50 - size));
					break;
				
				default:
					System.out.println("Invalid Choise!! -- Please Choose one option. ");
			}
		}
	}
}
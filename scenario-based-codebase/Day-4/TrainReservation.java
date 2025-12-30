/*12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).
*/
import java.util.*;

public class TrainReservation{
	
	 public static void trainReservationQueue(){
		Scanner sc = new Scanner(System.in);
		String[] seats = new String[10];
		int[] age = new int[10];
		int[] date = new int[10];
		int atIdx = 0;

		while(true){
			if(seats.length == atIdx){
				System.out.println("Seats Full !!");
				break;
			}
			
			int userSelect;
			System.out.println("1 -> Book Tickets");
			System.out.println("2 -> Check Available Seats");
			System.out.println("3 -> Exit");
			userSelect = sc.nextInt();
			
			while(userSelect != 1 && userSelect != 2 && userSelect != 3){
			System.out.println("1 Invalid Choice -- Enter Again --");
			System.out.println("1 --> Book Tickets");
				System.out.println("2 --> Check Available Seats");
				System.out.println("3 --> Exit");
				userSelect = sc.nextInt();
			}
				
			if(userSelect == 3){
				System.out.println("Thank You For Visiting.");
				break;
			}   

			switch(userSelect){
				case 1:{
					System.out.print("Enter Name: ");
					seats[atIdx] = sc.next();
					System.out.print("Enter age: ");
					age[atIdx] = sc.nextInt();
					System.out.print("Enter Date of Travelling: ");
					date[atIdx] = sc.nextInt();
			
					System.out.println("Booking Successfull ");
					System.out.println("Booking Details ");
						System.out.println("Booking Name : " + seats[atIdx]);
					System.out.println("Age : " + age[atIdx]);
					System.out.println("Booking Date : " + date[atIdx]);
					System.out.println("Thank You For Booking ");
					atIdx++;
					break;
					}
				case 2:{
					System.out.println("Available Seats: " + (seats.length - atIdx));
					break;
				}
			}
		}
	}
	
	public static void main(String args[]){
		trainReservationQueue();
	}
}
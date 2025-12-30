/*
14. Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.
*/

import java.util.*;

public class MovieTicket{
	public static void main(String[]args){
	
        Scanner sc = new Scanner(System.in);

        int totalSeats = 5;
        int customerNumber = 1;

        while (totalSeats-- > 0) {

            System.out.println("\n---------------- Movie Booking App ----------------");
            System.out.println("Customer No: " + customerNumber++);
			
            System.out.println("Select Movie Type:");
            System.out.println("1. Comedy  (₹150)");
            System.out.println("2. Horror  (₹180)");
            System.out.println("3. Romance (₹160)");
            System.out.println("4. Action  (₹200)");
            System.out.print("Enter your choice: ");
            int movieChoice = sc.nextInt();

            int moviePrice = 0;
            String movieName = "";

            switch (movieChoice) {
                case 1:
                    movieName = "Comedy";
                    moviePrice = 150;
                    break;
                case 2:
                    movieName = "Horror";
                    moviePrice = 180;
                    break;
                case 3:
                    movieName = "Romance";
                    moviePrice = 160;
                    break;
                case 4:
                    movieName = "Action";
                    moviePrice = 200;
                    break;
                default:
                    movieName = "Invalid";
                    moviePrice = 0;
            }

            // Select Seat
            System.out.print("Enter Seat Type (1. Gold ₹100 extra, 2. Silver): ");
            int seatType = sc.nextInt();

            int seatPrice = 0;
            String seatName = "";

            if (seatType == 1) {
                seatName = "Gold";
                seatPrice = 100;
            } else if (seatType == 2) {
                seatName = "Silver";
                seatPrice = 0;
            } else {
                seatName = "Invalid";
            }

            // Snacks Selection
            System.out.println("Select Snack:");
            System.out.println("1. Popcorn + Coldrink (₹120)");
            System.out.println("2. Popcorn (₹70)");
            System.out.println("3. Coldrink (₹50)");
            System.out.println("4. Burger (₹90)");
            System.out.println("5. Samosa (₹40)");
            System.out.println("6. None");
            System.out.print("Enter your choice: ");
            int snackChoice = sc.nextInt();

            int snackPrice = 0;
            String snackName = "";

            switch (snackChoice) {
                case 1:
                    snackName = "Popcorn + Coldrink";
                    snackPrice = 120;
                    break;
                case 2:
                    snackName = "Popcorn";
                    snackPrice = 70;
                    break;
                case 3:
                    snackName = "Coldrink";
                    snackPrice = 50;
                    break;
                case 4:
                    snackName = "Burger";
                    snackPrice = 90;
                    break;
                case 5:
                    snackName = "Samosa";
                    snackPrice = 40;
                    break;
                case 6:
                    snackName = "None";
                    snackPrice = 0;
                    break;
                default:
                    snackName = "Invalid";
            }

            // Final Bill
            int totalBill = moviePrice + seatPrice + snackPrice;

            System.out.println("\n--------- Booking Summary ---------");
            System.out.println("Movie     : " + movieName + " (₹" + moviePrice + ")");
            System.out.println("Seat Type : " + seatName + " (₹" + seatPrice + ")");
            System.out.println("Snack     : " + snackName + " (₹" + snackPrice + ")");
            System.out.println("-----------------------------------");
            System.out.println("Total Bill: ₹" + totalBill);
            System.out.println("-----------------------------------");
        }

        System.out.println("\nAll seats are booked. Thank you!");
        sc.close();
    }
}
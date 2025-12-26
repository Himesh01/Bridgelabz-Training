import java.util.*;
 
public class CoffeeCounter{
	public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        String choice = "";
        final double GST_RATE = 0.18;

        System.out.println("Welcome to the Café!");

        while (true) {
            System.out.println("Menu: Espresso (100), Latte (150), Cappuccino (120)");
            System.out.print("Enter coffee type (or 'exit' to quit): ");
            choice = sc.next().toLowerCase();

            if (choice.equals("exit")) {
                break;
            }

            int price = 0;
            switch (choice) {
                case "espresso":    price = 100; break;
                case "latte":       price = 150; break;
                case "cappuccino": price = 120; break;
                default:
                    System.out.println("Invalid coffee type. Please try again.");
                    continue;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            int subtotal = price * quantity;
            double gstAmount = subtotal * GST_RATE;
            double totalBill = subtotal + gstAmount;

            System.out.println("Subtotal: " + subtotal);
            System.out.println("GST (18%): " + gstAmount);
            System.out.println("Total Bill: " + totalBill);
        }

        System.out.println("Thank you for visiting!");
        sc.close();
    }
}
	
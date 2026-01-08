package scenariobasedpractice.medistore;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("---------Welcome To Patel Medicial Store--------\n");
		Scanner sc = new Scanner(System.in);
		Store store = new Store();
		do {
			System.out.println("Enter '1' to add Medicine      :");
			System.out.println("Enter '2' to remove Medicine   :");
			System.out.println("Enter '3' to sell Medicine     :");
			System.out.println("Enter '4' to view all Medicine :");
			System.out.println("Enter '5' to exit              :");
			int n = sc.nextInt();
			sc.nextLine();
			if(n==1) {
				System.out.println("\nEnter Medicine Type :");
				String type = sc.nextLine();
				System.out.println("Enter Medicine Name :");
				String name = sc.nextLine();
				System.out.println("Enter Medicine Price:");
				double price = sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter Expiry Date   :");
			    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			    String d = sc.nextLine();
			    LocalDate date = LocalDate.parse(d, formatter);
			    System.out.println("Enter quantity      :");
			    int quantity = sc.nextInt();
			    sc.nextLine();
			    store.addMedicine(type, name, price, quantity, date);
			}else if(n==2) {
				System.out.println("Enter Medicine Name :");
				String name = sc.nextLine();
				store.removeMedicine(name);
			}else if(n==3) {
				System.out.println("Enter Medicine Name :");
				String name = sc.nextLine();
				System.out.println("Enter Quantity      :");
				int quan = sc.nextInt();
				store.sell(name, quan);
			}else if(n==4) {
				store.view();
			}else {
				System.out.println("Thank you for comming");
				break;
			}
		}while(true);
	}
}
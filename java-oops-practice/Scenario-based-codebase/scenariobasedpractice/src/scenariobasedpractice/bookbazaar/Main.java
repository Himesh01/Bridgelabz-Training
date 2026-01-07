package scenariobasedpractice.bookbazaar;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n-------Book Bazar--------");
		BookStore store = new BookStore();
		do {
			System.out.println("\nEnter 1 to view Books : ");
			System.out.println("Enter 2 to buy Book   : ");
			System.out.println("Enter 3 to exit       : ");
			int n = sc.nextInt();
			sc.nextLine();
			if(n==1) {
				store.view();
			}else if(n==2) {
				System.out.println("Enter Book Title :");
				String name = sc.nextLine();
				System.out.println("Enter Quantity   :");
				int q = sc.nextInt();
				store.buy(name, q);
			}else {
				System.out.println("Thank you come again");
				break;
			}
		}while(true);
	}
}
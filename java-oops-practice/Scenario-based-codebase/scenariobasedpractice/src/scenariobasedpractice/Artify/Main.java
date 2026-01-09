package scenariobasedpractice.Artify;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n---------Welcome To Art Gallery---------");
		System.out.println("\nEnter your name      : ");
		String name = sc.nextLine();
		System.out.println("Enter Deposit amount : ");
		double amount = sc.nextDouble();
		User user = new User(name,amount);
		Store store = new Store();
		do {
			System.out.println("\nEnter '1' to View Gallery        :");
			System.out.println("Enter '2' to View Specific Art   :");
			System.out.println("Enter '3' to Buy Art             :");
			System.out.println("Enter '4' to Check balance       :");
			System.out.println("Enter '5' to Exit                :");
			int n = sc.nextInt();
			sc.nextLine();
			
			if(n==1) {
				store.details();
			}else if(n==2) {
				System.out.println("Enter The Title :");
				String title = sc.nextLine();
				store.certainDetail(title);
			}else if(n==3) {
				System.out.println("Enter the Title        :");
				String title = sc.nextLine();
				System.out.println("Enter the License Type :");
				String license = sc.nextLine();
				user.setPrice(store.buy(title, license,user.getPrice()));
			}else if(n==4){
				 System.out.println("\nRemainig balance : "+user.getPrice());
			}else {
				System.out.println("Thank you for Visting \n Art Is Feeling");
				break;
			}
		}while(true);
	}
}
package scenariobasedpractice.customeraccount;

import java.util.*;

public class Bank {
	static int idx = 101;
	public static void main(String[] args) {
		System.out.println("-----State Bank Of India-----");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name :");
		String name = sc.nextLine();
		System.out.println("Enter the Id   :");
		int id = sc.nextInt();
		Customer customer = new Customer(name,id);
		do {
			System.out.println("Enter '1' to create bank Account : ");
			System.out.println("Enter '2' to deposit money       : ");
			System.out.println("Enter '3' to withdrawal money    : ");
			System.out.println("Enter '4' to check balance       : ");
			System.out.println("Enter '5' to exit                : ");
			int n = sc.nextInt();
			if(n==1) {
				System.out.println("Enter the amount to deposit      : ");
				double amount = sc.nextDouble();
				System.out.println("Enter the Account No             : ");
				int k = sc.nextInt();
				SavingsAccount sa = new SavingsAccount(amount,15,k);
				customer.openAccount(sa);
			}else if(n==2){
				System.out.println("Enter amount to deposit          : ");
				double a = sc.nextDouble();
				System.out.println("Enter the Account Number         : ");
				int ac = sc.nextInt();
				customer.deposit(a, ac);
			}else if(n==3) {
				System.out.println("Enter amount to withdrawal       : ");
				double a = sc.nextDouble();
				System.out.println("Enter the Account Number         : ");
				int ac = sc.nextInt();
				customer.withdrawal(a, ac);
			}else if(n==4){
				System.out.println("Enter the Account Number         : ");
				int a = sc.nextInt();
				customer.checkBalance(a);
			}else {
				System.out.println("Thank you come again ");
				break;
			}
		}while(true);
	}   
}

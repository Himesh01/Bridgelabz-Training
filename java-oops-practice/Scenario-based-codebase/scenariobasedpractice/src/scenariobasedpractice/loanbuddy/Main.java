package scenariobasedpractice.loanbuddy;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------Welcome To City Bank---------");
		Bank bank = new Bank();
		do {
			System.out.println("Enter '1' to add Customer  :");
			System.out.println("Enter '2' to get Loan      :");
			System.out.println("Enter '3' to pay EMI       :");
			System.out.println("Enter '4' to view Details  :");
			System.out.println("Enter '5' to exit          :");
			int n =sc.nextInt();
			sc.nextLine();
			if(n==1) {
				System.out.println("Enter Customer Nane :");
				String name = sc.nextLine();
				System.out.println("Enter Customer Id   :");
				int cusId = sc.nextInt();
				System.out.println("Enter Credit Score  :");
				float creditScore = sc.nextFloat();
				bank.addCustomer(cusId, name, creditScore);
			}else if(n==2) {
				System.out.println("Enter Customer Id   :");
				int cusId = sc.nextInt();
				System.out.println("Enter Loan Id       :");
				int loanId = sc.nextInt();
				System.out.println("Enter Loan Amount   :");
				double amount = sc.nextDouble();
				bank.getLoan(cusId, loanId, amount);
			}else if(n==3) {
				System.out.println("Enter Customer Id   :");
				int cusId = sc.nextInt();
				System.out.println("Enter Loan Id       :");
				int loanId = sc.nextInt();
				System.out.println("Enter EMI Amount    :");
				double amount = sc.nextDouble();
				bank.payEMI(amount, cusId, loanId);
			}else if(n==4) {
				System.out.println("Enter customer Id   :");
				int cusId = sc.nextInt();
				bank.getDetails(cusId);
			}else {
				System.out.println("\nThank you for coming");
				break;
			}
		}while(true);
	}
}
/*
18. Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).
*/

import java.util.*;

public class CurrencyExchange{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		do{		
			System.out.println("---------------------------Currency Exchanger---------------------------");
			System.out.println("Currency available to exchange");
			System.out.println("\n1) US dollars");
			System.out.println("2) Euro");
			System.out.println("3) Pound");
			System.out.println("4) Yen");
			System.out.println("5) Yuan");
			
			System.out.print("\nEnter the currency type you want: ");
			int num = sc.nextInt();
			
			System.out.print("\nEnter amount in Indian rupees(INR): ");
			double amount = sc.nextDouble();
			
			switch(num){
				case 1:
					System.out.println(amount+" INR : "+ (amount/89.30)+" Dollars");
					break;
				case 2:
					System.out.println(amount+" INR : "+ (amount/104.85)+" Euro");
					break;
				case 3:
					System.out.println(amount+" INR : "+ (amount/120.35)+" Pound");
					break;
				case 4:
					System.out.println(amount+" INR : "+ (amount/0.575)+" Yen");
					break;
				case 5:
					System.out.println(amount+" INR : "+ (amount/12.57)+" Yuan");
					break;
				default: 
					System.err.println("Invalid choice!");
			}
			System.out.print("\nDo you want to exchange more money(y/n): ");
			char choice = sc.next().charAt(0);
			sc.nextLine();
			
			if(choice =='n' || choice =='N'){
				System.out.println("\nThank You!, Please visit again!");
				break;
			}	
			
		}while(true);
	}
}
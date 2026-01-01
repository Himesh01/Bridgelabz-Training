package com.bridgelabz.oops.inheritance.hierarchicalinheritance.bankaccount;

public class BankAccount {
	 String accountNumber;
	 double balance;
	 BankAccount(String accountNumber, double balance) {
		 this.accountNumber = accountNumber;
		 this.balance = balance;
	 }
	 void displayBaseInfo() {
		 System.out.println("Account Number: " + accountNumber);
		 System.out.println("Current Balance: $" + balance);
	 }
}

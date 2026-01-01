package com.bridgelabz.oops.inheritance.hierarchicalinheritance.bankaccount;

public class SavingsAccount extends BankAccount{
	double interestRate;
	SavingsAccount(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
		void displayAccountType() {
	    displayBaseInfo();
	    System.out.println("Account Type: Savings | Interest Rate: " + interestRate + "%");
	}
}

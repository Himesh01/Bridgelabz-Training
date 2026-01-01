package com.bridgelabz.oops.inheritance.hierarchicalinheritance.bankaccount;

public class CheckingAccount extends BankAccount{
	double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        displayBaseInfo();
        System.out.println("Account Type: Checking | Daily Withdrawal Limit: $" + withdrawalLimit);
    }
}

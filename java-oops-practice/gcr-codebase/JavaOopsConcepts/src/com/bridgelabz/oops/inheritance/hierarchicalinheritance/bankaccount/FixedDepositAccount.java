package com.bridgelabz.oops.inheritance.hierarchicalinheritance.bankaccount;

public class FixedDepositAccount extends BankAccount {
	int lockInPeriodMonths;

    FixedDepositAccount(String accountNumber, double balance, int lockInPeriodMonths) {
        super(accountNumber, balance);
        this.lockInPeriodMonths = lockInPeriodMonths;
    }

    void displayAccountType() {
        displayBaseInfo();
        System.out.println("Account Type: Fixed Deposit | Lock-in Period: " + lockInPeriodMonths + " months");
    }
}

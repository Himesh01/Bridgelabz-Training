package com.bridgelabz.oops.encapsulation.bankingsystem;

public abstract class BankAccount {
	 private String accountNumber;
	    private String holderName;
	    private double balance;

	    public BankAccount(String accountNumber, String holderName, double balance) {
	        this.accountNumber = accountNumber;
	        this.holderName = holderName;
	        this.balance = balance;
	    }
	    
	    public String getAccountNumber() {
	        return accountNumber;
	    }

	    protected String getHolderName() {
	        return holderName;
	    }

	    public double getBalance() {
	        return balance;
	    }

	   
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: ₹" + amount);
	        }
	    }
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: ₹" + amount);
	        } else {
	            System.out.println("Insufficient balance!");
	        }
	    }
	    public abstract double calculateInterest();


		public double calculateLoanEligibility() {
			
			return 0;
		}
		public void applyForLoan() {
		}
}

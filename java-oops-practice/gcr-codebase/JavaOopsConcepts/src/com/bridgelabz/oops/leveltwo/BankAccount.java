package com.bridgelabz.oops.leveltwo;

public class BankAccount {

	
	private String accountHolder;
	private String accountNumber;
	private double balance;
	
	
	public BankAccount(String accountHolder,String accountNumber,double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	//creating method to display bank name
	public static void displayBank() {
		System.out.println("\t\t\t\tState Bank of Gujrat\t\t\t\t");
		
	}
	
	//Creating the method to calculate the deposit
	public void deposit(double amount) {
		if(amount > 0) {
			balance+=amount;
			System.out.println("Deposited: "+amount);
		}
		else {
			System.out.println("Amount to deposit must be positive");
		}
	}
	
	//Creating the method to calculate the withdraw amount
	public void withdraw(double amount) {
		if (amount <= balance && amount > 0) {
			balance -= amount;
			System.out.println("Withdraw amount is : "+amount);
		}
		else if (amount <= 0) {
			System.out.println("Withdrawal amount must be positive");
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	
	// Method to display the current balance
   public void displayBalance() {
       System.out.println("Current balance: " + balance);
   }
   
   
   public static void main(String[] args) {
       
       BankAccount account = new BankAccount("Lynda", "123456789", 700.00);
      
       
       displayBank();
      
      
       account.displayBalance();
       
       account.deposit(200.00);
       account.displayBalance();
      
       account.withdraw(100.00);
       account.displayBalance();
       
       account.withdraw(900.00);
   }
}
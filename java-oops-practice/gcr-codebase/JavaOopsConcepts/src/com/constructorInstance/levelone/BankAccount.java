package com.constructorInstance.levelone;

public class BankAccount {
	public int accountNumber;
	protected String accountHolder;
	private double balance;
	
	BankAccount(int accNo, String accHolder, double balance){
		this.accountHolder = accHolder;
		this.accountNumber = accNo;
		this.balance = balance;
	}
	public void setBalance(double bal) {
		this.balance = bal;
	}
	public void getBalance() {
		System.out.println("Balance: "+this.balance);
	}
}
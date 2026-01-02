package com.bridgelabz.oops.encapsulation.bankingsystem;

import java.util.ArrayList;

public class BankingMain {
	  public static void main(String[] args) {

	        ArrayList<BankAccount> accounts = new ArrayList<>();

	        accounts.add(new SavingsAccount("SA101", "Amit", 50000));
	        accounts.add(new CurrentAccount("CA201", "Rohit", 100000));

	        BankService.processAccounts(accounts);
	    }
}

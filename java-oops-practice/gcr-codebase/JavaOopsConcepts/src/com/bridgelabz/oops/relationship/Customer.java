package com.bridgelabz.oops.relationship;

import java.util.ArrayList;
public class Customer {
	 private String name;
	    private ArrayList<Account> accounts;

	    public Customer(String name) {
	        this.name = name;
	        accounts = new ArrayList<>();
	    }

	    public void addAccount(Account account) {
	        accounts.add(account);
	    }

	    public void viewBalances() {
	        System.out.println("Customer: " + name);
	        for (Account account : accounts) {
	            System.out.println(
	                "Bank: " + account.getBank().getName() +
	                ", Balance: $" + account.getBalance()
	            );
	        }
	        System.out.println();
	    }
}

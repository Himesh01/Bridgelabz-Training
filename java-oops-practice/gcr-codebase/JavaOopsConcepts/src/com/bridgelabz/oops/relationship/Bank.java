package com.bridgelabz.oops.relationship;

import java.util.ArrayList;
public class Bank {
	private String name;
	private ArrayList<Account>accounts;
	
	public Bank(String name) {
		this.name = name;
		accounts = new ArrayList<>();
	}
	public Account openAccount(Customer customer) {
        Account account = new Account(this);
        accounts.add(account);
        customer.addAccount(account);
        return account;
    }

    public String getName() {
        return name;
    }
	
}

package com.bridgelabz.oops.relationship;

public class Account {
    private Bank bank;
    private double balance;

    public Account(Bank bank) {
        this.bank = bank;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }
}
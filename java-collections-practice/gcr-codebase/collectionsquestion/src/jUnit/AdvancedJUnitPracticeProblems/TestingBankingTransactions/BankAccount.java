package jUnit.AdvancedJUnitPracticeProblems.TestingBankingTransactions;

public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Invalid deposit amount");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance)
            throw new IllegalArgumentException("Insufficient funds");
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
package scenariobasedpractice.ewalletapplication;

import java.util.ArrayList;
import java.util.List;

public abstract class Wallet {
    private double balance; 
    protected double transferLimit;
    private List<String> transactionHistory;

    public Wallet(double initialLoad, double referralBonus) {
        this.balance = initialLoad + referralBonus; 
        this.transactionHistory = new ArrayList<>();
        this.transactionHistory.add("Wallet initialized with: $" + balance);
    }

    public double getBalance() { return balance; }

    protected void updateBalance(double amount) {
        this.balance += amount;
    }

    public void addLog(String log) {
        transactionHistory.add(log);
    }

    public void viewHistory() {
        System.out.println("--- Transaction History ---");
        transactionHistory.forEach(System.out::println);
    }

    public abstract void processTransaction(double amount);
}
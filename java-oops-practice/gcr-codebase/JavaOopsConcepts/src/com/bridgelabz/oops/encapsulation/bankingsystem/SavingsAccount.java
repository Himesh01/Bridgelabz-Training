package com.bridgelabz.oops.encapsulation.bankingsystem;

class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04; 
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan applied for Savings Account");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5;
    }
}

package com.bridgelabz.oops.encapsulation.bankingsystem;

class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02; // 2% interest
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan applied for Current Account");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 10;
    }
}
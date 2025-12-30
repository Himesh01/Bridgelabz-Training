package com.bridgelabz.oops.relationship;

public class BankAccountCustomer {
	public static void main(String[] args) {

        Bank bankA = new Bank("National Bank");
        Bank bankB = new Bank("City Bank");

        Customer alice = new Customer("Alice");

        Account acc1 = bankA.openAccount(alice);
        acc1.deposit(500);

        Account acc2 = bankB.openAccount(alice);
        acc2.deposit(1000);

        alice.viewBalances();
    }
}

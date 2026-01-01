package com.bridgelabz.oops.inheritance.hierarchicalinheritance.bankaccount;

public class BankAccountMain {
	public static void main(String[] args) {
        System.out.println("--- 2026 Banking System Dashboard ---");

        SavingsAccount savings = new SavingsAccount("SAV-2026-001", 5000.0, 3.5);
        CheckingAccount checking = new CheckingAccount("CHK-2026-002", 2500.0, 1000.0);
        FixedDepositAccount fd = new FixedDepositAccount("FD-2026-003", 10000.0, 24);

        savings.displayAccountType();
        System.out.println("------------------------------------");
        checking.displayAccountType();
        System.out.println("------------------------------------");
        fd.displayAccountType();
    }
}

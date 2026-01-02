package com.bridgelabz.oops.encapsulation.bankingsystem;

import java.util.*;
public class BankService {
	 public static void processAccounts(List<BankAccount> accounts) {

		 for (BankAccount acc : accounts) {
			 System.out.println("Account Number: " + acc.getAccountNumber());
			 System.out.println("Balance: ₹" + acc.getBalance());
			 double interest = acc.calculateInterest();
			 System.out.println("Interest Earned: ₹" + interest);
			 
			 if (acc instanceof Loanable) {
				 Loanable loan = (Loanable) acc;
				 loan.applyForLoan();
				 System.out.println("Loan Eligibility: ₹" + loan.calculateLoanEligibility());
			 }
			 
			 System.out.println("----------------------------");
		 }	
	 }
}

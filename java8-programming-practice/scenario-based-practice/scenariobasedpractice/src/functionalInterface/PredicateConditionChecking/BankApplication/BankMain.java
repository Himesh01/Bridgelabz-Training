package functionalInterface.PredicateConditionChecking.BankApplication;

import java.util.function.Predicate;

public class BankMain {
	public static void main(String[] args) {

        Bank account = new Bank(5000);

        Predicate<Double> validWithdrawal =
                amount -> amount > 0 && amount <= account.balance;

        System.out.println("Withdraw 2000: " + validWithdrawal.test(2000.0));
        System.out.println("Withdraw 7000: " + validWithdrawal.test(7000.0));
    }
}

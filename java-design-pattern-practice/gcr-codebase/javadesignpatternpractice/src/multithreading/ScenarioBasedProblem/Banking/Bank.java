package multithreading.ScenarioBasedProblem.Banking;

import java.util.HashMap;
import java.util.Map;

// Thread-safe Bank that manages account balances.
public class Bank {

	// Using per-account synchronization for better concurrency
	private final Map<Integer, Integer> balances = new HashMap<>();
	private final Map<Integer, Object> locks = new HashMap<>();

	// Helper method to get lock for an account (create if not exists)
	private Object getAccountLock(int accountNumber) {
		synchronized (locks) {
			return locks.computeIfAbsent(accountNumber, amount-> new Object());
		}
	}

	// Deposit amount into the account
	public void deposit(int accountNumber, int amount) {
		if (amount <= 0) {			
			return;
		}

		Object lock = getAccountLock(accountNumber);

		synchronized (lock) {
			int current = getBalance(accountNumber);
			int newBalance = current + amount;

			synchronized (balances) {
				balances.put(accountNumber, newBalance);
			}

			System.out.printf("[Deposit]   Acc %d: %d --> %d  (+%d)%n", accountNumber, current, newBalance, amount);
		}
	}

	// Withdraw amount from the account (only if sufficient balance)
	public void withdraw(int accountNumber, int amount) {
		if (amount <= 0) {			
			return;
		}

		Object lock = getAccountLock(accountNumber);

		synchronized (lock) {
			int current = getBalance(accountNumber);

			if (current >= amount) {
				int newBalance = current - amount;

				synchronized (balances) {
					balances.put(accountNumber, newBalance);
				}

				System.out.printf("[Withdraw]  Acc %d: %d --> %d  (-%d)%n", accountNumber, current, newBalance, amount);
			} else {
				System.out.printf("[Withdraw]  FAILED  Acc %d: %d < %d%n", accountNumber, current, amount);
			}
		}
	}

	// Get current balance of an account
	public int getBalance(int accountNumber) {
		synchronized (balances) {
			return balances.getOrDefault(accountNumber, 0);
		}
	}
}
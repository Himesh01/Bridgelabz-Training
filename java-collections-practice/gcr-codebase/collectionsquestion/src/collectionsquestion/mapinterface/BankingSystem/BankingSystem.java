package collectionsquestion.mapinterface.BankingSystem;
import java.util.*;

public class BankingSystem {
	private HashMap<Integer, Double> accounts = new HashMap<>();

    private Queue<Integer> withdrawalQueue = new LinkedList<>();

    public void createAccount(int accNo, double balance) {
        accounts.put(accNo, balance);
    }

    public void requestWithdrawal(int accNo) {
        withdrawalQueue.add(accNo);
    }

    public void processWithdrawals(double amount) {

        System.out.println("\nProcessing withdrawals of ₹" + amount);

        while (!withdrawalQueue.isEmpty()) {
            int accNo = withdrawalQueue.poll();

            double bal = accounts.get(accNo);

            if (bal >= amount) {
                accounts.put(accNo, bal - amount);
                System.out.println("Withdrawal successful for account " + accNo);
            } else {
                System.out.println("Insufficient balance for account " + accNo);
            }
        }
    }

    public void showAccountsSortedByBalance() {

        System.out.println("\nAccounts sorted by balance:");

        TreeMap<Double, Integer> sorted = new TreeMap<>();

        for (Map.Entry<Integer, Double> e : accounts.entrySet()) {
            sorted.put(e.getValue(), e.getKey());
        }

        for (Map.Entry<Double, Integer> e : sorted.entrySet()) {
            System.out.println("Account " + e.getValue() + " → ₹" + e.getKey());
        }
    }
}

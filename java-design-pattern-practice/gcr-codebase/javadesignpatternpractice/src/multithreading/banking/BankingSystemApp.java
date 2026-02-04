package multithreading.banking;

public class BankingSystemApp {
    
    public static void main(String[] args) {
        System.out.println("====== Banking System ======\n");
        
        // Single shared bank account
        BankAccount account = new BankAccount(10000);
        
        System.out.printf("Initial Balance: %.0f%n%n", account.getBalance());
        
        // Different withdrawal requests
        String[] customers = {"Himesh", "Nageshwar", "Raj", "Rajeev", "Mona"};
        double[] amounts = {1000, 4000, 2000, 5000, 1500};
        
        Thread[] threads = new Thread[5];
        
        for (int i = 0; i < 5; i++) {
            Transaction tx = new Transaction(account, amounts[i], customers[i]);
            threads[i] = new Thread(tx, "Customer-" + (i+1));
        }
        
        // Show thread states before starting
        System.out.println("Thread states before start:");
        for (Thread t : threads) {
            System.out.println(t.getName() + " : " + t.getState());
        }
        System.out.println();
        
        // Start all transactions almost simultaneously
        for (Thread t : threads) {
            t.start();
        }
        
        // Wait for all transactions to complete
        try {
            for (Thread t : threads) {
                t.join();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        System.out.println("\nAll transactions completed.");
        System.out.printf("Final Balance: %.0f%n", account.getBalance());
        System.out.println("\nNote: You may observe incorrect final balance due to race condition!");
        System.out.println("This is expected behavior in this version (no synchronization).");
    }
}
package multithreading.banking;

public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public boolean withdraw(double amount, String customerName) {
        if (balance >= amount) {
            // Simulating some processing time (increases chance of race condition)
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            balance -= amount;
            System.out.printf("Transaction successful: %s, Amount: %.0f, Balance: %.0f%n",
                    customerName, amount, balance);
            return true;
        } else {
            System.out.printf("Transaction FAILED: %s, Amount: %.0f, Insufficient Balance: %.0f%n",
                    customerName, amount, balance);
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }
}
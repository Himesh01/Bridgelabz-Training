package multithreading.ScenarioBasedProblem.Banking;

public class BankApp {
    public static void main(String[] args) {
        System.out.println("====== Bank Appliocation - Concurrent Transactions ======\n");

        Bank bank = new Bank();

        Customer[] customers = {
            new Customer(bank, 101, "Customer-1"),
            new Customer(bank, 102, "Customer-2"),
            new Customer(bank, 103, "Customer-3"),
            new Customer(bank, 104, "Customer-4")
        };

        for (Customer c : customers) {
            c.start();
        }

        try {
            for (Customer c : customers) {
                c.join();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n====== Final Balances ======");
        for (int i = 0; i < customers.length; i++) {
            int acc = 101 + i;
            System.out.printf("Account %d : %d%n", acc, bank.getBalance(acc));
        }

        System.out.println("\n====== Transactions completed ======");
    }
}
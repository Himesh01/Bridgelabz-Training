package multithreading.banking;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction implements Runnable {

    private final BankAccount account;
    private final double amount;
    private final String customerName;

    private static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

    public Transaction(BankAccount account, double amount, String customerName) {
        this.account = account;
        this.amount = amount;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        System.out.printf("[%s] %s Attempting to withdraw %.0f%n", threadName, customerName, amount);

        boolean success = account.withdraw(amount, customerName);

        if (!success) {
            System.out.printf("[%s] %s - Transaction declined (time: %s)%n",
                    threadName, customerName,
                    LocalDateTime.now().format(TIME_FORMAT));
        }
    }
}
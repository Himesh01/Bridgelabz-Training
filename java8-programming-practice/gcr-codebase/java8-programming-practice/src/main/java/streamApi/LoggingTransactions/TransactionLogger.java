package streamApi.LoggingTransactions;

import java.time.LocalDateTime;
import java.util.List;

public class TransactionLogger {
    public static void main(String[] args) {
        List<Transaction> transactions = List.of(
            new Transaction("TXN-1001"),
            new Transaction("TXN-1002"),
            new Transaction("TXN-1003")
        );

        System.out.println("--- System Transaction Log ---");

        transactions.forEach(txn -> 
            System.out.println(LocalDateTime.now() + " - Transaction: " + txn.getId())
        );
    }
}

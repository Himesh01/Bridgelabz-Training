package methodReferences.InvoiceObjectCreation;

import java.util.List;

public class InvoiceGenerator {

    public static void main(String[] args) {

        List<Integer> transactionIds = List.of(
                1001, 1002, 1003, 1004
        );

        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)   
                .toList();

        invoices.forEach(System.out::println);
    }
}
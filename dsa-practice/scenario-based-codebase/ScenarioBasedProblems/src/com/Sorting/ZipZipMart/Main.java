package com.Sorting.ZipZipMart;

public class Main {

    public static void main(String[] args) {

        Transaction[] transactions = {
            new Transaction("2026-01-12", 1500),
            new Transaction("2026-01-10", 500),
            new Transaction("2026-01-10", 500),
            new Transaction("2026-01-11", 800),
            new Transaction("2026-01-12", 300)
        };

        System.out.println("Before Sorting:");
        for (Transaction t : transactions) {
            t.display();
        }

        ZipZipMartSorter.mergeSort(transactions, 0, transactions.length - 1);

        System.out.println("\nAfter Sorting (Date → Amount):");
        for (Transaction t : transactions) {
            t.display();
        }
    }
}

package com.Sorting.ZipZipMart;

public class Transaction {
    String date;      // YYYY-MM-DD
    double amount;

    public Transaction(String date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public void display() {
        System.out.println(date + " | ₹" + amount);
    }
}

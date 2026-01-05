package com.stackqueue.stockspan;

public class Main {
    public static void main(String[] args) {

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        StockSpan calculator = new StockSpan();
        int[] span = calculator.calculateSpan(prices);

        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}

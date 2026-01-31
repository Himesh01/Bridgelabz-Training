package collectors.OrderRevenueSummary;

import java.util.*;
import java.util.stream.Collectors;

public class RevenueSummary {
    public static void main(String[] args) {
        List<Order> orders = List.of(
            new Order("Himesh", 250.50),
            new Order("Raj", 150.00),
            new Order("Ankit", 50.25),
            new Order("Vardan", 500.00),
            new Order("Raj", 300.75)
        );

        Map<String, Double> revenuePerCustomer = orders.stream()
            .collect(Collectors.groupingBy(
                Order::getCustomerName,
                Collectors.summingDouble(Order::getAmount)
            ));

        System.out.println("Total Revenue Per Customer:");
        revenuePerCustomer.forEach((customer, total) -> 
            System.out.println(customer + ": $" + String.format("%.2f", total)));
    }
}

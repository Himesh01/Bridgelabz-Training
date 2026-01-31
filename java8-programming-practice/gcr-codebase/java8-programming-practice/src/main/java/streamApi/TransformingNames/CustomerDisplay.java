package streamApi.TransformingNames;

import java.util.*;
import java.util.stream.Collectors;

public class CustomerDisplay {
    public static void main(String[] args) {
        List<Customer> customers = List.of(
            new Customer("Himesh"),
            new Customer("Rajeev"),
            new Customer("Raj"),
            new Customer("Nitin")
        );

        List<String> formattedNames = customers.stream()
            .map(customer -> customer.getName().toUpperCase())
            .sorted()
            .collect(Collectors.toList());

        System.out.println("Formatted Customer List:");
        formattedNames.forEach(System.out::println);
    }
}

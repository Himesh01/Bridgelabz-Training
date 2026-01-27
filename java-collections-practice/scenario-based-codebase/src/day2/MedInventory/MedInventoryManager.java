package day2.MedInventory;

import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import java.util.regex.*;

public class MedInventoryManager {

    private static final String FILE = "inventory.csv";
    private static final int CRITICAL_LIMIT = 10;

    public static void main(String[] args) {

        Map<String, List<Item<String>>> categoryMap = new HashMap<>();
        Set<Item<String>> uniqueItems = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {

            String line;
            while ((line = br.readLine()) != null) {
                try {
                    Item<String> item = parseLine(line);
                    uniqueItems.add(item);
                } catch (Exception e) {
                    System.out.println(" Skipping invalid line → " + line);
                }
            }

        } catch (Exception e) {
            System.out.println(" File reading error");
        }

        for (Item<String> item : uniqueItems) {
            categoryMap
                .computeIfAbsent(item.getItemType(), k -> new ArrayList<>())
                .add(item);
        }

        System.out.println("\n Categorized Inventory:\n");
        categoryMap.forEach((type, items) -> {
            System.out.println(" " + type);
            items.forEach(System.out::println);
            System.out.println();
        });

        detectExpiredItems(uniqueItems);
        checkCriticalStock(uniqueItems);
    }

    private static Item<String> parseLine(String line) throws Exception {

        String regex = "^[A-Za-z0-9]+,[A-Za-z ]+,[0-9]+,\\d{2}-\\d{2}-\\d{4}$";
        if (!Pattern.matches(regex, line)) {
            throw new IllegalArgumentException("Invalid CSV format");
        }

        String[] arr = line.split(",");

        return new Item<>(
                arr[0],
                detectCategory(arr[1]),
                arr[1],
                Integer.parseInt(arr[2]),
                arr[3]
        );
    }

    private static String detectCategory(String name) {

        if (name.toLowerCase().contains("glove")) return "Safety";
        if (name.toLowerCase().contains("syringe")) return "Injection";
        if (name.toLowerCase().contains("oxygen")) return "LifeSupport";

        return "General";
    }

    private static void detectExpiredItems(Set<Item<String>> items) {

        System.out.println("\n Expired Items:\n");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate today = LocalDate.now();

        items.stream()
             .filter(i -> LocalDate.parse(i.getExpiryDate(), formatter).isBefore(today))
             .forEach(System.out::println);
    }

    private static void checkCriticalStock(Set<Item<String>> items) {

        System.out.println("\n Critical Stock Alerts:\n");

        items.forEach(item -> {
            try {
                if (item.getQuantity() < CRITICAL_LIMIT) {
                    throw new LowStockException("LOW STOCK → " + item);
                }
            } catch (LowStockException e) {
                System.out.println(e.getMessage());
            }
        });
    }
}
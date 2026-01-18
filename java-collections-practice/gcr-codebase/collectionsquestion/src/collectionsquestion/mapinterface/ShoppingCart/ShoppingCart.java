package collectionsquestion.mapinterface.ShoppingCart;

import java.util.*;

public class ShoppingCart {

    private HashMap<String, Double> priceMap = new HashMap<>();

    private LinkedHashMap<String, Double> orderMap = new LinkedHashMap<>();

    public void addItem(String product, double price) {
        priceMap.put(product, price);
        orderMap.put(product, price);
    }

    public void showCartInOrder() {
        System.out.println("\nItems in order of addition:");
        for (Map.Entry<String, Double> e : orderMap.entrySet()) {
            System.out.println(e.getKey() + " → ₹" + e.getValue());
        }
    }

    public void showSortedByPrice() {
        System.out.println("\nItems sorted by price:");

        TreeMap<Double, String> sorted = new TreeMap<>();

        for (Map.Entry<String, Double> e : priceMap.entrySet()) {
            sorted.put(e.getValue(), e.getKey());
        }

        for (Map.Entry<Double, String> e : sorted.entrySet()) {
            System.out.println(e.getValue() + " → ₹" + e.getKey());
        }
    }
}
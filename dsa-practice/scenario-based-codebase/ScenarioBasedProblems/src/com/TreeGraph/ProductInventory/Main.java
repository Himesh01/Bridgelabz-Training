package com.TreeGraph.ProductInventory;

public class Main {

	public static void main(String[] args) {
        ProductBST bst = new ProductBST();

        bst.insertOrUpdate(new Product(1001, "Laptop", 1200.00));
        bst.insertOrUpdate(new Product(1003, "Smartphone", 800.00));
        bst.insertOrUpdate(new Product(1002, "Headphones", 150.00));
        bst.insertOrUpdate(new Product(1005, "Smartwatch", 250.00));
        bst.insertOrUpdate(new Product(1004, "Tablet", 400.00));

        bst.displaySorted();

        System.out.println("Searching for SKU 1003:");
        Product p = bst.search(1003);
        System.out.println(p != null ? p : "Product not found.");

        System.out.println("Updating SKU 1002 price to $180");
        bst.insertOrUpdate(new Product(1002, "Headphones", 180.00));

        bst.displaySorted();

        bst.displaySorted();
    }

}
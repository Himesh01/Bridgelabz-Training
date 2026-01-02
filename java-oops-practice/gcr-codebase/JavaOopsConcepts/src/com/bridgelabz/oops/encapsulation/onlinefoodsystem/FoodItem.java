package com.bridgelabz.oops.encapsulation.onlinefoodsystem;

public abstract class FoodItem {
	private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

   
    protected void updateQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: ₹" + price);
        System.out.println("Quantity: " + quantity);
    }

    
    public abstract double calculateTotalPrice();
}

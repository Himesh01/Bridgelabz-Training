package com.bridgelabz.oops.encapsulation.onlinefoodsystem;

class VegItem extends FoodItem implements Discountable {

    public VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount * 0.10; 
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: 10%";
    }
}

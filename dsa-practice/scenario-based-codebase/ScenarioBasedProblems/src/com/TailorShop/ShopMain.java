package com.TailorShop;
import java.util.*;

public class ShopMain {
	public static void main(String[] args) {
        TailorShop shop = new TailorShop();

        shop.addNewOrder(new Order("Raj", 5));
        shop.addNewOrder(new Order("Nitin", 2));
        shop.addNewOrder(new Order("Rajeev", 4));
        shop.displayOrders();

        shop.addNewOrder(new Order("Vansh", 1));
        shop.displayOrders();
    }
}

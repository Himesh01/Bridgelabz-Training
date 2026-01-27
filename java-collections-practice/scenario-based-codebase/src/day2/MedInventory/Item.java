package day2.MedInventory;

import java.util.Objects;

public class Item<T> {

    private String itemId;
    private T itemType;
    private String itemName;
    private int quantity;
    private String expiryDate;

    public Item(String itemId, T itemType, String itemName, int quantity, String expiryDate) {
        this.itemId = itemId;
        this.itemType = itemType;
        this.itemName = itemName;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    public String getItemId() {
        return itemId;
    }

    public T getItemType() {
        return itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item<?> item = (Item<?>) o;
        return itemId.equals(item.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId);
    }

    @Override
    public String toString() {
        return itemId + " | " + itemName + " | Qty: " + quantity + " | Exp: " + expiryDate;
    }
}
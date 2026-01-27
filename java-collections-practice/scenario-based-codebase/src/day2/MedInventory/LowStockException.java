package day2.MedInventory;

public class LowStockException extends Exception {

    public LowStockException(String message) {
        super(message);
    }
}
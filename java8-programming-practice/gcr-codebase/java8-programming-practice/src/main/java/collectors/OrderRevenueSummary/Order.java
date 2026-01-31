package collectors.OrderRevenueSummary;

public class Order {
	
    private String customerName;
    private double amount;

    public Order(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }

    public String getCustomerName() { return customerName; }
    public double getAmount() { return amount; }
}

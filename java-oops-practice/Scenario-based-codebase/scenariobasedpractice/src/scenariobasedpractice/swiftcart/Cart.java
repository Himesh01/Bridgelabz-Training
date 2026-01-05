package scenariobasedpractice.swiftcart;
import java.util.*;


public class Cart implements Checkout {
	private ArrayList<Product> products;
    private double totalPrice;

    public Cart() {
        products = new ArrayList<>();
        totalPrice = 0.0;
    }

    public Cart(ArrayList<Product> products) {
        this.products = products;
        calculateTotal();
    }

    public void addProduct(Product product, int quantity) {
        products.add(product);
        totalPrice += product.getPrice() * quantity; 
    }

    // Encapsulated price calculation
    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getPrice();
        }
    }

    @Override
    public void applyDiscount(double coupon) {
        double discountedTotal = 0;

        for (Product p : products) {
            discountedTotal += p.applyDiscount(p.getPrice()); 

        totalPrice = discountedTotal - coupon; 
        }
    }

    @Override
    public void generateBill() {
        System.out.println("------ SwiftCart Bill ------");
        for (Product p : products) {
            System.out.println(p.getName() + " : ₹" + p.getPrice());
        }
        System.out.println("Total Payable: ₹" + totalPrice);
    }
}

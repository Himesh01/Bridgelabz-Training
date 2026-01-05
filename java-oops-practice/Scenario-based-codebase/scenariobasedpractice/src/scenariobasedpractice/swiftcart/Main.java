package scenariobasedpractice.swiftcart;

public class Main {
	public static void main(String[] args) {

        Product butter = new PerishableProduct("Butter", 50);
        Product beans = new NonPerishableProduct("Beans", 100);

        Cart cart = new Cart();
        cart.addProduct(butter, 2);  
        cart.addProduct(beans, 2);

        cart.applyDiscount(50); 
        cart.generateBill();
    }
}

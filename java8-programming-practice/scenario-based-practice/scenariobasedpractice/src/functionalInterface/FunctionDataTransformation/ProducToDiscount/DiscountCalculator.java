package functionalInterface.FunctionDataTransformation.ProducToDiscount;

import java.util.function.Function;

public class DiscountCalculator {
	public static void main(String[] args) {

        double discountPercent = 10;

        Function<Product, Double> discountedPrice =
                product -> product.price - (product.price * discountPercent / 100);

        Product p1 = new Product("Laptop", 50000);

        System.out.println(p1.name + " Discounted Price: " + discountedPrice.apply(p1));
    }
}

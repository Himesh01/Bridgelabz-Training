package genrics.DynamicOnlineMarketplace;

public class MarketplaceUtil {
	 public static <T extends Product<?>> void applyDiscount(T product, double percentage) {

	        double discount = product.getPrice() * (percentage / 100);
	        double finalPrice = product.getPrice() - discount;

	        product.setPrice(finalPrice);

	        System.out.println(
	            "Discount Applied: " + percentage + "% on " +
	            product.getName() + " | New Price: ₹" + finalPrice
	        );
	    }
}

package functionalInterface.PredicateConditionChecking.ECommerceApp;

import java.util.function.Predicate;

public class ECommerceMain {
	 public static void main(String[] args) {

	        Predicate<ECommerce> freeDelivery =
	        		ECommerce -> ECommerce.amount >= 1000;

	        ECommerce o1 = new ECommerce(1500);
	        ECommerce o2 = new ECommerce(600);

	        System.out.println("Order1 Free Delivery: " + freeDelivery.test(o1));
	        System.out.println("Order2 Free Delivery: " + freeDelivery.test(o2));
	    }
}

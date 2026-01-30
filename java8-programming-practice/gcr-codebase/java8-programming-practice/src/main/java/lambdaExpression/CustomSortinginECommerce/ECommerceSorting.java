package lambdaExpression.CustomSortinginECommerce;
import java.util.*;
import java.util.ArrayList;


public class ECommerceSorting {
	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product(1,"Laptop",58000,5.6,12));
		products.add(new Product(2,"Mouse",480,6.8,15));
		products.add(new Product(3,"I Phone",120000,8.9,18));
		products.add(new Product(4,"I Pad",140000,7.9,10));
		
		products.sort((p1,p2) ->
		Double.compare(p1.price, p2.price));
		
		System.out.println("Sorted by Price0");
		products.forEach(System.out::println);
		
		products.sort((p1,p2) ->
		Double.compare(p1.rating, p2.rating));
		
		System.out.println("\nSorted by Rating");
		products.forEach(System.out::println);
		
		products.sort((p1,p2) ->
		 Double.compare(p1.discount, p2.discount));
		
		System.out.println("\nSorted by Discount");
		products.forEach(System.out::println);
		
		
	}
}

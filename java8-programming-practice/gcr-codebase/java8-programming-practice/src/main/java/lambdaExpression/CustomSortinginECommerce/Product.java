package lambdaExpression.CustomSortinginECommerce;

public class Product {
	int id;
	String name;
	double price;
	double rating;
	double discount;
	
	public Product(int id ,String name , double price, double rating ,double discount) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.discount = discount;
	}
	@Override
	public String toString() {
		return name + "	| Price: " + price + 
				"	| Rating: " + rating +
	            "	| Discount: " + discount + "%";
	}
}

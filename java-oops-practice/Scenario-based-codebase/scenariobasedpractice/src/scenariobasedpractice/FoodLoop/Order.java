package scenariobasedpractice.FoodLoop;
import java.util.ArrayList;

public class Order implements IOrderable {
	private ArrayList<FoodItem> items = new ArrayList<>();
	private double total =0;
	
	public void addItem(FoodItem item) {
		if(item.isAvailable()) {
			items.add(item);
			total += item.getPrice();
			item.reduceStock();
			System.out.println(item.getName() +" added ");
		}
		else {
			System.out.println("Item is out of stock");
		}
	}
	public double applyDiscount() {
		if(total >=500)
			return total*.20;
		else if(total >=300)
			return total*10;
		else
			return 0;
	}
	@Override
	public void placeOrder() {
		double discount = applyDiscount();
		total = total - discount;
		System.out.println("Your order is placed :");
		System.out.println("Total amount :" + (total + discount));
		System.out.println("Final amount after discount :" + total);
	}
	
	@Override
	public void cancelOrder() {
		items.clear();
		total = 0;
		System.out.println("Order Cancelled");
	}
}

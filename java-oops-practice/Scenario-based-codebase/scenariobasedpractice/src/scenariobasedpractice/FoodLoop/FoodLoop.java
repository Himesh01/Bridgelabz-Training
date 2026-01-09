package scenariobasedpractice.FoodLoop;
import java.util.*;

public class FoodLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		FoodItem vegPizza  = new VegItem("Veg Pizza", 300 , 2);
		FoodItem burger = new NonVegItem("Burger",320,2);
		
		Order order = new Order();
		
		while(true) {
			System.out.println("------Welcome to Resturant----");
			System.out.println("1. Veg Pizza");
			System.out.println("2. Chicken Burger");
			System.out.println("3. Place Order");
			System.out.println("4. Cancel Order");
			System.out.println(" Enter Choice");
			
			int choice =sc.nextInt();
			
			switch(choice) {
			case 1:
				order.addItem(vegPizza);
				break;
			case 2: 
				order.addItem(burger);
				break;
			case 3:
				order.placeOrder();
				return;
			case 4:
				order.cancelOrder();
				return;
			default :
				System.out.println("Invalid Choice");
			}
		}
	}
}

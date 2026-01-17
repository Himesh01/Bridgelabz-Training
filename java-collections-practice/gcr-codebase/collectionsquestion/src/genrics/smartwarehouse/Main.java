package genrics.smartwarehouse;

public class Main {
	public static void main(String[] args) {
		SmartWareHouse<Product> warehouse = new SmartWareHouse<>();
		warehouse.addProduct(new Electronic("TV",10000,5.5));
		warehouse.addProduct(new Furniture("SoFa",1500,4.5));
		warehouse.addProduct(new Groceries("Poha",150,5.6));
		warehouse.display();
		
	}
}

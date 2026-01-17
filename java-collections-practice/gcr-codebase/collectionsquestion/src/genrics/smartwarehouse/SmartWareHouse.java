package genrics.smartwarehouse;

import java.util.ArrayList;

public class SmartWareHouse<T>{
	ArrayList<T> arr = new ArrayList<>();
	
	public void addProduct(T product) {
		arr.add(product);
	}
	public void deleteProduct(T product) {
		if(arr.contains(product)) {
			arr.remove(product);
		}else {
			System.out.println("Product Not Found");
		}
	}
	public void display() {
		arr.stream().forEach(System.out::println);
	}
}
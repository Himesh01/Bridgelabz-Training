package scenariobasedpractice.BagnBallOrganizer;
import java.util.ArrayList;

import java.util.ArrayList;

public class Bag {
	private static int id=1;
	private int bagId;
	private ArrayList<Ball> bag;
	private int capacity;
	private String color;
	private int cnt =0;
	
	public Bag(String color, int capacity) {
		this.bagId = id++;
		this.capacity = capacity;
		bag = new ArrayList<>();
		this.color = color;
	}
	
	public void addBall(Ball b) {
		if(cnt==capacity) {
			System.out.println("Bag is already full");
			return;
		}
		bag.add(b);
		cnt++;
	}
	public void removeBall() {
		if(bag.size()==0) {
			System.out.println("No ball available to remove");
			return;
		}
		Ball b =bag.get(bag.size()-1);
		System.out.println("Ball removed sucessfully");
		System.out.println("Ball details: ");
		System.out.println("Ball id: "+b.getId());
		System.out.println("Ball color: "+b.getColor());
		System.out.println("Ball size: "+b.getSize());
		bag.remove(bag.size()-1);
	}
	
	public void display() {
		for(Ball b: bag) {
			System.out.println("Ball details: ");
			System.out.println("Ball id: "+b.getId());
			System.out.println("Ball color: "+b.getColor());
			System.out.println("Ball size: "+b.getSize()+"\n");
		}
	}
	public int getId() {
		return bagId;
	}
	public String getColor() {
		return color;
	}
	public int getCapacity() {
		return capacity;
	}
	public int getBallCount() {
		return bag.size();
	}
}
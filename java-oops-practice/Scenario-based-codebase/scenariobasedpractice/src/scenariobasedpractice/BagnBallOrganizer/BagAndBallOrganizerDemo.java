package scenariobasedpractice.BagnBallOrganizer;

import java.util.*;

public class BagAndBallOrganizerDemo {
	public static void main(String[] args) {
		ArrayList<Bag> bags = new ArrayList<>();
		
		Bag b1 = new Bag("Red",5);
		b1.addBall(new Ball("White","small"));
		b1.addBall(new Ball("Red","medium"));
		b1.addBall(new Ball("Green", "Large"));
		b1.addBall(new Ball("Black", "Large"));
		b1.addBall(new Ball("Yellow", "Medium"));
		
		bags.add(b1);
		Bag b2 = new Bag("Purple",5);
		b2.addBall(new Ball("White","small"));
		b2.addBall(new Ball("Red","medium"));
		b2.addBall(new Ball("Green", "Large"));
		b2.addBall(new Ball("Black", "Large"));
		b2.addBall(new Ball("Yellow", "Medium"));
		bags.add(b2);
		
		Bag b3 = new Bag("Green",5);
		b3.addBall(new Ball("White","small"));
		b3.addBall(new Ball("Red","medium"));
		b3.addBall(new Ball("Green", "Large"));
		b3.addBall(new Ball("Black", "Large"));
		bags.add(b3);
		
		displayAllBags(bags);
	}
	
	public static void displayAllBags(ArrayList<Bag> bags) {
		for(Bag b: bags) {
			System.out.println("Bag id: "+b.getId());
			System.out.println("Bag color: "+b.getColor());
			System.out.println("Bag capacity: "+b.getCapacity());
			System.out.println("Total balls in this bag: "+b.getBallCount());
			System.out.println("\n--------------Ball Details---------------");
			b.display();
		}
	}
}
package scenariobasedpractice.BirdSanctuary;

public abstract class Bird {
	private String name;
	private String species;
	private int id;
	
	public Bird(String name, String species ,int id) {
		this.name = name;
		this.species = species;
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void eat() {
		System.out.println(name + " is eating.");
	}
	public void displayInfo() {
		System.out.print("ID: " + id + ", Name: " + name + ", Species: " + species);
	}
}

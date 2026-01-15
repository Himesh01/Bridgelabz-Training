package scenariobasedpractice.BirdSanctuary;

public class Duck extends Bird implements Flyable,Swimmable {
	public Duck(String name, int id) {
        super(name, "Duck", id);
    }

    public void fly() {
        System.out.print(" | Can Fly");
    }

    public void swim() {
        System.out.println(" | Can Swim");
    }
}

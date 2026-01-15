package scenariobasedpractice.BirdSanctuary;

public class Eagle extends Bird implements Flyable {

    public Eagle(String name, int id) {
        super(name, "Eagle", id);
    }

    public void fly() {
        System.out.println(" | Can Fly: Soaring high");
    }
}
 
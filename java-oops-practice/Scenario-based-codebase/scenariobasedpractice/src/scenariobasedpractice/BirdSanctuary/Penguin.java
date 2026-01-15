package scenariobasedpractice.BirdSanctuary;

class Penguin extends Bird implements Swimmable {

    public Penguin(String name, int id) {
        super(name, "Penguin", id);
    }

    public void swim() {
        System.out.println(" | Can Swim: Excellent swimmer");
    }
}

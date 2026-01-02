package scenariobasedpractice.universitycourse;

public class Undergraduate extends Student{
	public Undergraduate(String id, String name) {
        super(id, name);
        this.studentType = "UG";
    }

    @Override
    public void displayRole() {
        System.out.println("[Undergraduate] " + getName());
    }
}

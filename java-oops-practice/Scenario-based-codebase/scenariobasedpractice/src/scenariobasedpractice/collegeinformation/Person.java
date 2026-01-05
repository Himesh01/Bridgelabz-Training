package scenariobasedpractice.collegeinformation;

public abstract class Person {
	protected int id;
    protected String name;
    protected String email;

    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Polymorphism
    public abstract void printDetails();
}

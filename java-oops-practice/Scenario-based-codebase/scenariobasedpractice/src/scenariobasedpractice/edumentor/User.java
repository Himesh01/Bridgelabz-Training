package scenariobasedpractice.edumentor;

public abstract class User {
	protected String name;
    protected String email;
    protected int userId;

    public User(String name, String email, int userId) {
        this.name = name;
        this.email = email;
        this.userId = userId;
    }
}

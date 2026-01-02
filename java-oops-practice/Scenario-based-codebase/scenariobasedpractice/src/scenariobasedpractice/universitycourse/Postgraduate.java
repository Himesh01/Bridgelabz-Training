package scenariobasedpractice.universitycourse;

public class Postgraduate extends Student{
	private String researchTopic;

    public Postgraduate(String id, String name, String topic) {
        super(id, name);
        this.researchTopic = topic;
        this.studentType = "PG";
    }

    @Override
    public void displayRole() {
        System.out.println("[Postgraduate] " + getName() + " | Research: " + researchTopic);
    }
}

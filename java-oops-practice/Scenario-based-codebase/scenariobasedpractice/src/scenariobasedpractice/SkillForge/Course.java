package scenariobasedpractice.SkillForge;

public class Course {

    private String title;
    private Instructor instructor;
    private String[] modules;

    protected double rating;

    private final String[] reviews = {"Good", "Very Helpful"};

    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[]{"Introduction", "Basics", "Advanced"};
        this.rating = 4.0;
    }

    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.rating = 4.5;
    }

    public void generateCertificate(String level) {
        if (level.equalsIgnoreCase("Beginner")) {
            System.out.println("Beginner Course Certificate for " + title);
        } else if (level.equalsIgnoreCase("Advanced")) {
            System.out.println("Advanced Professional Certificate for " + title);
        }
    }

    public String[] getReviews() {
        return reviews;
    }

    public int getTotalModules() {
        return modules.length;
    }
}

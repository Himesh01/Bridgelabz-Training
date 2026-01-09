package scenariobasedpractice.SkillForge;

public class Student extends User implements ICertifiable {

    private int progress;

    public Student(String name, String email) {
        super(name, email);
        this.progress = 0;
    }

    public void updateProgress(int completedModules, int totalModules) {
        progress = (completedModules * 100) / totalModules;
    }

    @Override
    public void generateCertificate() {
        if (progress == 100) {
            System.out.println("Certificate generated for student: " + name);
        } else {
            System.out.println("Course not completed yet");
        }
    }
}

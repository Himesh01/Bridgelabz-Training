package scenariobasedpractice.SkillForge;

public class Main {

    public static void main(String[] args) {

        Instructor instructor =
                new Instructor("Himesh", "himesh@skillforge.com");

        Course javaCourse =
                new Course("Java Programming", instructor);

        Student student =
                new Student("Rajeev", "rajeev@gmail.com");

        student.updateProgress(3, javaCourse.getTotalModules());
        student.generateCertificate();

        javaCourse.generateCertificate("Beginner");
    }
}

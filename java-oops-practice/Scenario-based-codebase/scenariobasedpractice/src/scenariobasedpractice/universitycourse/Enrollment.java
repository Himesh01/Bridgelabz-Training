package scenariobasedpractice.universitycourse;

public class Enrollment implements Grade{
	private Student student;
    private String courseName;
    private String finalGrade;

    public Enrollment(Student student, String courseName) {
        this.student = student;
        this.courseName = courseName;
    }

    @Override
    public void assignGrade(double score) {
        if (score >= 90) finalGrade = "A";
        else if (score >= 80) finalGrade = "B";
        else finalGrade = "C";
        
        student.updateGPA(score / 20); 
        System.out.println("Grade " + finalGrade + " assigned to " + student.getName());
    }
}
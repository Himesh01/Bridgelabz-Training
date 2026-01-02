package scenariobasedpractice.universitycourse;

public abstract class Student {
	private String studentId;
    private String name;
    private double gpa; 
    protected String studentType;

    
    public Student(String studentId, String name, String elective) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = 0.0;
    }

    
    public Student(String studentId, String name) {
        this(studentId, name, "General");
    }

    public void updateGPA(double newGrade) {
        this.gpa = (this.gpa + newGrade) / 2;
    }

    public String getTranscript() {
        return "Student: " + name + " [" + studentId + "] | GPA: " + gpa;
    }
    public String getName() {
    	return name;
    }

    public abstract void displayRole();
}
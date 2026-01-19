package genrics.MultiLevelUniversityCourseManagementSystem;

public abstract class CourseType {

    private String courseName;
    private int credits;

    public CourseType(String courseName, int credits) {
        this.courseName = courseName;
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public abstract String evaluationMethod();
}
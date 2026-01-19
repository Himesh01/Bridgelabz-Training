package genrics.MultiLevelUniversityCourseManagementSystem;

public class AssignmentCourse extends CourseType {

    public AssignmentCourse(String courseName, int credits) {
        super(courseName, credits);
    }

    @Override
    public String evaluationMethod() {
        return "Assignment Based Evaluation";
    }
}
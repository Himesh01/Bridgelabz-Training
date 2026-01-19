package genrics.MultiLevelUniversityCourseManagementSystem;

public class ExamCourse extends CourseType {

    public ExamCourse(String courseName, int credits) {
        super(courseName, credits);
    }

    @Override
    public String evaluationMethod() {
        return "Exam Based Evaluation";
    }
}
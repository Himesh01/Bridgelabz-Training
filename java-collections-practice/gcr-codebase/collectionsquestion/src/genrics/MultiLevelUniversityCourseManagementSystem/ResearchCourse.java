package genrics.MultiLevelUniversityCourseManagementSystem;

public class ResearchCourse extends CourseType {

    public ResearchCourse(String courseName, int credits) {
        super(courseName, credits);
    }

    @Override
    public String evaluationMethod() {
        return "Research Based Evaluation";
    }
}
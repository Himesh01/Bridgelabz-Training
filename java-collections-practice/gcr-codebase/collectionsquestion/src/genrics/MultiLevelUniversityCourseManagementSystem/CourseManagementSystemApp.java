package genrics.MultiLevelUniversityCourseManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class CourseManagementSystemApp{
    public static void main(String[] args) {

        ExamCourse dsa = new ExamCourse("Data Structures", 4);
        AssignmentCourse oop = new AssignmentCourse("OOP in Java", 3);
        ResearchCourse ai = new ResearchCourse("AI Research", 5);

        Course<ExamCourse> examCourse =
                new Course<>(dsa, "Computer Science");

        Course<AssignmentCourse> assignmentCourse =
                new Course<>(oop, "Information Technology");

        Course<ResearchCourse> researchCourse =
                new Course<>(ai, "AI & ML");

        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(dsa);
        allCourses.add(oop);
        allCourses.add(ai);

        System.out.println("🎓 University Course List:");
        UniversityUtil.displayCourses(allCourses);
    }
}
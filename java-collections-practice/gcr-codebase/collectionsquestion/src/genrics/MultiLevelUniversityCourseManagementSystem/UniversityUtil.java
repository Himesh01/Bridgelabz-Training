package genrics.MultiLevelUniversityCourseManagementSystem;

import java.util.List;

public class UniversityUtil {

    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println( "Course: " + course.getCourseName() + ", Credits: " + course.getCredits() + ", Evaluation: " + course.evaluationMethod());
        }
    }
}
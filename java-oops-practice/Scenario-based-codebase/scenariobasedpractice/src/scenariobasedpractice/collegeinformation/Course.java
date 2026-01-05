package scenariobasedpractice.collegeinformation;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseCode;
    private String courseName;
    private Faculty faculty;
    private List<Student> students;

    public Course(String courseCode, String courseName, Faculty faculty) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.faculty = faculty;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void printCourseDetails() {
        System.out.println("Course: " + courseName + " (" + courseCode + ")");
        System.out.println("Faculty: " + faculty.name);
        System.out.println("Total Students: " + students.size());
    }
}

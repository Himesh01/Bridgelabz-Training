package scenariobasedpractice.collegeinformation;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person implements ICourseActions {

    private List<Double> grades;   // private grades
    private List<Course> courses;

    public Student(int id, String name, String email) {
        super(id, name, email);
        grades = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    // GPA calculation using operators
    public double calculateGPA() {
        double total = 0;
        for (double g : grades) {
            total += g;
        }
        return grades.size() == 0 ? 0 : total / grades.size();
    }

    @Override
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    @Override
    public void dropCourse(Course course) {
        courses.remove(course);
        course.removeStudent(this);
    }

    @Override
    public void printDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("GPA: " + calculateGPA());
    }
}

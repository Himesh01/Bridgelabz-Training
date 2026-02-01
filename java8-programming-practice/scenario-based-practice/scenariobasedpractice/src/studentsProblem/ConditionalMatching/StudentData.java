package studentsProblem.ConditionalMatching;

import java.util.Arrays;
import java.util.List;

public class StudentData {

    public static List<Student> getStudents() {

        return Arrays.asList(
                new Student(1, "Himesh", 22, "Mechanical Engineering"),
                new Student(2, "Neha", 24, "Computer Science"),
                new Student(3, "Ravi", 26, "Biotech Engineering"),
                new Student(4, "Priya", 21, "Electrical Engineering")
        );
    }
}

package studentsProblem.BasicFilteringMapping;
import java.util.*;

public class StudentData {

    public static List<Student> getStudents() {

        return Arrays.asList(
                new Student(1, "Himesh", 22, "Male", "Sagar", 45,
                        "Mechanical Engineering", "9876543210"),
                new Student(2, "Neha", 27, "Female", "Delhi", 60,
                        "Computer Science", "9876543211"),
                new Student(3, "Ravi", 30, "Male", "Pune", 35,
                        "Mechanical Engineering", "9876543212"),
                new Student(4, "Priya", 24, "Female", "Mumbai", 80,
                        "Electrical Engineering", "9876543213"),
                new Student(5, "Rajeev", 21, "Male", "Vidisha", 20,
                        "Mechanical Engineering", "9876543214")
        );
    }
}

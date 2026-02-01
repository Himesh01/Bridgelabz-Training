package studentsProblem.FlatMapCollections;
import java.util.*;

public class StudentData {

    public static List<Student> getStudents() {

        return Arrays.asList(
                new Student(1, "Himesh", 22, "Male", "Sagar", 45,
                        "Mechanical Engineering",
                        Arrays.asList("9876543210", "9123456780")),

                new Student(2, "Neha", 27, "Female", "Delhi", 60,
                        "Computer Science",
                        Arrays.asList("9876543211")),

                new Student(3, "Ravi", 30, "Male", "Pune", 35,
                        "Mechanical Engineering",
                        Arrays.asList("9876543212", "9988776655", "9123000000")),

                new Student(4, "Priya", 24, "Female", "Mumbai", 80,
                        "Electrical Engineering",
                        Arrays.asList("9876543213"))
        );
    }
}

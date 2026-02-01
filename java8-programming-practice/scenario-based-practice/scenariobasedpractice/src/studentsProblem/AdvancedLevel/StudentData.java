package studentsProblem.AdvancedLevel;

import java.util.Arrays;
import java.util.List;

public class StudentData {

    public static List<Student> getStudents() {

        return Arrays.asList(
                new Student(1, "Himesh", "Mechanical", 45),
                new Student(2, "Sneha", "Computer", 30),
                new Student(3, "Ravi", "Mechanical", 15),
                new Student(4, "Rajeev", "Electronics", 22),
                new Student(5, "Priya", "Computer", 11),
                new Student(6, "Sonia", "Computer", 8)
        );
    }
}

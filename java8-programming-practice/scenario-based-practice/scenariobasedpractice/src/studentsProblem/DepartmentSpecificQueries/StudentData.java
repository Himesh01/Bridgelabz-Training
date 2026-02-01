package studentsProblem.DepartmentSpecificQueries;

import java.util.Arrays;
import java.util.List;

public class StudentData {

    public static List<Student> getStudents() {

        return Arrays.asList(
                new Student(1, "Himesh", 22,
                        "Mechanical Engineering", "Bhopal", 45),

                new Student(2, "Neha", 24,
                        "Computer Engineering", "Maharashtra", 30),

                new Student(3, "Ravi", 20,
                        "Computer Engineering", "Karnataka", 15),

                new Student(4, "Priya", 21,
                        "Electronics Engineering", "Karnataka", 25),

                new Student(5, "Rajeev", 23,
                        "Mechanical Engineering", "Vidisha", 10),

                new Student(6, "Sneha", 22,
                        "Electronics Engineering", "Karnataka", 40)
        );
    }
}

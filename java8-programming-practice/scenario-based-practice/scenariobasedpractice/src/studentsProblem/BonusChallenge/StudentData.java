package studentsProblem.BonusChallenge;

import java.util.Arrays;
import java.util.List;

public class StudentData {

    public static List<Student> getStudents() {

        return Arrays.asList(
                new Student(1, "Himesh", 22, "Bhopal", "Mechanical", 120),
                new Student(2, "Sneha", 27, "Delhi", "Computer", 85),
                new Student(3, "Ravi", 20, "Mumbai", "Mechanical", 60),
                new Student(4, "Rajeev", 29, "Vidisha", "Electronics", 40),
                new Student(5, "Priya", 24, "Delhi", "Computer", 110),
                new Student(6, "Sanajha", 30, "Sagar", "Computer", 25),
                new Student(7, "Karan", 21, "Pune", "Mechanical", 70)
        );
    }
}

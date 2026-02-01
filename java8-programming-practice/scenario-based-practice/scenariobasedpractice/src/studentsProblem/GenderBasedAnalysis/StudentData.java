package studentsProblem.GenderBasedAnalysis;

import java.util.Arrays;
import java.util.List;

public class StudentData {

    public static List<Student> getStudents() {

        return Arrays.asList(
                new Student(1, "Himesh", 22, "Male", 45),
                new Student(2, "Neha", 24, "Female", 30),
                new Student(3, "Ravi", 26, "Male", 20),
                new Student(4, "Priya", 21, "Female", 15),
                new Student(5, "Rajeev", 28, "Male", 10)
        );
    }
}

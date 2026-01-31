package collectors.StudentResultGrouping;

import java.util.*;
import java.util.stream.Collectors;

public class StudentGrouping {
    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("Himesh", "A"),
            new Student("Bunty", "B"),
            new Student("Chandan", "A"),
            new Student("Dev", "C"),
            new Student("Raj", "B")
        );

        Map<String, List<String>> studentsByGrade = students.stream()
            .collect(Collectors.groupingBy(
                Student::getGrade, 
                Collectors.mapping(Student::getName, Collectors.toList())
            ));

        studentsByGrade.forEach((grade, names) -> 
            System.out.println("Grade " + grade + ": " + names));
    }
}

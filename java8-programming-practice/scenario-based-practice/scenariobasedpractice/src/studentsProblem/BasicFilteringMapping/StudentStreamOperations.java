package studentsProblem.BasicFilteringMapping;

import java.util.*;
import java.util.stream.Collectors;

public class StudentStreamOperations {

    //1.Print all students whose rank is less than 50.
    public static List<Student> rankLessThan50(List<Student> list) {
        return list.stream()
                .filter(s -> s.getRank() < 50)
                .collect(Collectors.toList());
    }

    //2.Print all students whose age is greater than 25.
    public static List<Student> ageGreaterThan25(List<Student> list) {
        return list.stream()
                .filter(s -> s.getAge() > 25)
                .collect(Collectors.toList());
    }

    // 3.Print the names of all students only.
    public static List<String> getStudentNames(List<Student> list) {
        return list.stream()
                .map(Student::getFirstName)
                .collect(Collectors.toList());
    }

    //4.Print all students belonging to Mechanical Engineering.
    public static List<Student> mechanicalStudents(List<Student> list) {
        return list.stream()
                .filter(s -> s.getBranch().equalsIgnoreCase("Mechanical Engineering"))
                .collect(Collectors.toList());
    }

    // 5.Print all students not from Mumbai.
    public static List<Student> notFromMumbai(List<Student> list) {
        return list.stream()
                .filter(s -> !s.getCity().equalsIgnoreCase("Mumbai"))
                .collect(Collectors.toList());
    }
}

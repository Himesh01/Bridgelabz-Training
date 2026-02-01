package studentsProblem.DepartmentSpecificQueries;

import java.util.*;
import java.util.stream.Collectors;

public class StudentService {

    // 1️ List students department-wise with names only
    public static Map<String, List<String>> studentsByDepartment(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment,
                        Collectors.mapping(Student::getName, Collectors.toList())
                ));
    }

    // 2️ Youngest student in Computer Engineering
    public static Optional<Student> youngestInComputerEngineering(List<Student> students) {
        return students.stream()
                .filter(s -> s.getDepartment()
                        .equalsIgnoreCase("Computer Engineering"))
                .min(Comparator.comparingInt(Student::getAge));
    }

    // 3️ Top-ranked student in Mechanical Engineering
    public static Optional<Student> topRankInMechanical(List<Student> students) {
        return students.stream()
                .filter(s -> s.getDepartment()
                        .equalsIgnoreCase("Mechanical Engineering"))
                .min(Comparator.comparingInt(Student::getRank));
    }

    // 4️ Count students in Electronics Engineering from Karnataka
    public static long countElectronicsFromKarnataka(List<Student> students) {
        return students.stream()
                .filter(s -> s.getDepartment()
                        .equalsIgnoreCase("Electronics Engineering"))
                .filter(s -> s.getState()
                        .equalsIgnoreCase("Karnataka"))
                .count();
    }
}

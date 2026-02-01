package studentsProblem.GenderBasedAnalysis;

import java.util.*;
import java.util.stream.Collectors;

public class StudentService {

    // 1️ Count male and female students
    public static Map<String, Long> countByGender(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGender,
                        Collectors.counting()
                ));
    }

    // 2️ Average age of male students
    public static double averageAgeOfMales(List<Student> students) {
        return students.stream()
                .filter(s -> s.getGender().equalsIgnoreCase("Male"))
                .mapToInt(Student::getAge)
                .average()
                .orElse(0.0);
    }

    // 3️ Average age of female students
    public static double averageAgeOfFemales(List<Student> students) {
        return students.stream()
                .filter(s -> s.getGender().equalsIgnoreCase("Female"))
                .mapToInt(Student::getAge)
                .average()
                .orElse(0.0);
    }

    // 4️ Highest ranked male student (lowest rank number = best rank)
    public static Optional<Student> highestRankedMale(List<Student> students) {
        return students.stream()
                .filter(s -> s.getGender().equalsIgnoreCase("Male"))
                .min(Comparator.comparingInt(Student::getRank));
    }

    // 5️ Highest ranked female student
    public static Optional<Student> highestRankedFemale(List<Student> students) {
        return students.stream()
                .filter(s -> s.getGender().equalsIgnoreCase("Female"))
                .min(Comparator.comparingInt(Student::getRank));
    }
}

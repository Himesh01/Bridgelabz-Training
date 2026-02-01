package studentsProblem.BonusChallenge;


import java.util.*;
import java.util.stream.Collectors;

public class StudentService {

    // 1️ Top 3 youngest students
    public static List<Student> top3Youngest(List<Student> students) {
        return students.stream()
                .sorted(Comparator.comparingInt(Student::getAge))
                .limit(3)
                .collect(Collectors.toList());
    }

    // 2️ Top 3 oldest students
    public static List<Student> top3Oldest(List<Student> students) {
        return students.stream()
                .sorted(Comparator.comparingInt(Student::getAge).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    // 3️ Partition students based on age > 25
    public static Map<Boolean, List<Student>> partitionByAge(List<Student> students) {
        return students.stream()
                .collect(Collectors.partitioningBy(s -> s.getAge() > 25));
    }

    // 4️ Partition students based on rank < 100
    public static Map<Boolean, List<Student>> partitionByRank(List<Student> students) {
        return students.stream()
                .collect(Collectors.partitioningBy(s -> s.getRank() < 100));
    }

    // 5️ City having maximum students
    public static Optional<String> cityWithMaxStudents(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(
                        Student::getCity,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    // 6️ Department having minimum students
    public static Optional<String> departmentWithMinStudents(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .min(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}

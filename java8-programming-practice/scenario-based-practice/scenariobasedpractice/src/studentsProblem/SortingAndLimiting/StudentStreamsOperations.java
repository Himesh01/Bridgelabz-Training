package studentsProblem.SortingAndLimiting;

import java.util.*;
import java.util.stream.Collectors;

public class StudentStreamsOperations {

    // 1️ Sort by rank (ascending)
    public static List<Student> sortByRankAscending(List<Student> list) {
        return list.stream()
                .sorted(Comparator.comparing(Student::getRank))
                .collect(Collectors.toList());
    }

    // 2️ Sort by age (descending)
    public static List<Student> sortByAgeDescending(List<Student> list) {
        return list.stream()
                .sorted(Comparator.comparing(Student::getAge).reversed())
                .collect(Collectors.toList());
    }

    // 3️ Top 5 students based on rank (lowest rank = better)
    public static List<Student> top5ByRank(List<Student> list) {
        return list.stream()
                .sorted(Comparator.comparing(Student::getRank))
                .limit(5)
                .collect(Collectors.toList());
    }

    // 4️ Last 3 students based on rank (highest rank numbers)
    public static List<Student> last3ByRank(List<Student> list) {
        return list.stream()
                .sorted(Comparator.comparing(Student::getRank).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    // 5️ Sort by name, then by rank
    public static List<Student> sortByNameThenRank(List<Student> list) {
        return list.stream()
                .sorted(Comparator.comparing(Student::getFirstName)
                        .thenComparing(Student::getRank))
                .collect(Collectors.toList());
    }
}

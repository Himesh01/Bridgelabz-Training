package studentsProblem.MinMaxRankingProblems;

import java.util.*;
import java.util.stream.Collectors;

public class StudentStreamOperations {

    // 1️ Best (Lowest) Rank
    public static Optional<Student> bestRankHolder(List<Student> list) {
        return list.stream()
                .min(Comparator.comparing(Student::getRank));
    }

    // 2️ Worst (Highest) Rank
    public static Optional<Student> worstRankHolder(List<Student> list) {
        return list.stream()
                .max(Comparator.comparing(Student::getRank));
    }

    // 3️ Second Best Rank Holder
    public static Optional<Student> secondBestRankHolder(List<Student> list) {
        return list.stream()
                .sorted(Comparator.comparing(Student::getRank))
                .skip(1)
                .findFirst();
    }

    // 4️ Third Best Rank Holder
    public static Optional<Student> thirdBestRankHolder(List<Student> list) {
        return list.stream()
                .sorted(Comparator.comparing(Student::getRank))
                .skip(2)
                .findFirst();
    }

    // 5️ Youngest Student
    public static Optional<Student> youngestStudent(List<Student> list) {
        return list.stream()
                .min(Comparator.comparing(Student::getAge));
    }

    // 6️ Oldest Student
    public static Optional<Student> oldestStudent(List<Student> list) {
        return list.stream()
                .max(Comparator.comparing(Student::getAge));
    }
}

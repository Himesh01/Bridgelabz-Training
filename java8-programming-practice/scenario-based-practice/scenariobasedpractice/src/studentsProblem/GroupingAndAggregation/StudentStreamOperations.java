package studentsProblem.GroupingAndAggregation;

import java.util.*;
import java.util.stream.Collectors;

public class StudentStreamOperations {

    // 1️ Count students in each department
    public static Map<String, Long> countByDepartment(List<Student> list) {
        return list.stream()
                .collect(Collectors.groupingBy(
                        Student::getBranch,
                        Collectors.counting()
                ));
    }

    // 2️ Count students in each city
    public static Map<String, Long> countByCity(List<Student> list) {
        return list.stream()
                .collect(Collectors.groupingBy(
                        Student::getCity,
                        Collectors.counting()
                ));
    }

    // 3️ Average age in each department
    public static Map<String, Double> averageAgeByDepartment(List<Student> list) {
        return list.stream()
                .collect(Collectors.groupingBy(
                        Student::getBranch,
                        Collectors.averagingInt(Student::getAge)
                ));
    }

    // 4️⃣ Average rank by gender
    public static Map<String, Double> averageRankByGender(List<Student> list) {
        return list.stream()
                .collect(Collectors.groupingBy(
                        Student::getGender,
                        Collectors.averagingInt(Student::getRank)
                ));
    }

    // 5️ Total number of students
    public static long totalStudents(List<Student> list) {
        return list.stream().count();
    }

    // 6️ Department with highest average rank
    public static Optional<Map.Entry<String, Double>> 
        departmentWithHighestAvgRank(List<Student> list) {

        Map<String, Double> avgRankByDept = list.stream()
                        .collect(Collectors.groupingBy(
                                Student::getBranch,
                                Collectors.averagingInt(Student::getRank)
                        ));

        return avgRankByDept.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
    }
}

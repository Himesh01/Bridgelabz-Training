package studentsProblem.AdvancedLevel;

import java.util.*;
import java.util.stream.Collectors;

public class StudentService {

    // 1️ Convert to Map<Id, Name>
    public static Map<Integer, String> convertToIdNameMap(List<Student> students) {
        return students.stream()
                .collect(Collectors.toMap(
                        Student::getId,
                        Student::getName
                ));
    }

    // 2️ Convert to Map<Department, List<Student>>
    public static Map<String, List<Student>> groupByDepartment(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment));
    }

    // 3️ Students whose name starts with 'S'
    public static List<Student> namesStartingWithS(List<Student> students) {
        return students.stream()
                .filter(s -> s.getName().startsWith("S"))
                .collect(Collectors.toList());
    }

    // 4️⃣ Students whose name length > 5
    public static List<Student> nameLengthGreaterThan5(List<Student> students) {
        return students.stream()
                .filter(s -> s.getName().length() > 5)
                .collect(Collectors.toList());
    }

    // 5️ Students whose rank is even
    public static List<Student> evenRankStudents(List<Student> students) {
        return students.stream()
                .filter(s -> s.getRank() % 2 == 0)
                .collect(Collectors.toList());
    }

    // 6️ Students whose rank is odd
    public static List<Student> oddRankStudents(List<Student> students) {
        return students.stream()
                .filter(s -> s.getRank() % 2 != 0)
                .collect(Collectors.toList());
    }
}

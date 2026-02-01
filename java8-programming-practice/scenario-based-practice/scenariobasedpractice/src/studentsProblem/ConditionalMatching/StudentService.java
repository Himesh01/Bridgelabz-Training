package studentsProblem.ConditionalMatching;

import java.util.List;

public class StudentService {

    // 1️ Any student from Biotech Engineering
    public static boolean anyStudentFromBiotech(List<Student> students) {
        return students.stream()
                .anyMatch(s ->
                        s.getBranch().equalsIgnoreCase("Biotech Engineering"));
    }

    // 2️ All students above age 20
    public static boolean allStudentsAbove20(List<Student> students) {
        return students.stream()
                .allMatch(s -> s.getAge() > 20);
    }

    // 3️ No student from Civil Engineering
    public static boolean noStudentFromCivil(List<Student> students) {
        return students.stream()
                .noneMatch(s ->
                        s.getBranch().equalsIgnoreCase("Civil Engineering"));
    }
}

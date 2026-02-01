package studentsProblem.DepartmentSpecificQueries;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        System.out.println("1. Students Department-Wise (Names Only):");
        System.out.println(StudentService.studentsByDepartment(students));

        System.out.println("\n2. Youngest Student in Computer Engineering:");
        System.out.println(
                StudentService.youngestInComputerEngineering(students)
                        .orElse(null)
        );

        System.out.println("\n3. Top Ranked Student in Mechanical Engineering:");
        System.out.println(
                StudentService.topRankInMechanical(students)
                        .orElse(null)
        );

        System.out.println("\n4. Count Electronics Engineering Students from Karnataka:");
        System.out.println(
                StudentService.countElectronicsFromKarnataka(students)
        );
    }
}

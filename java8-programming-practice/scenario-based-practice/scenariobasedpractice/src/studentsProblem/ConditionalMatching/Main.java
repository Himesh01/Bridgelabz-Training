package studentsProblem.ConditionalMatching;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        System.out.println("Any student from Biotech Engineering?");
        System.out.println(StudentService.anyStudentFromBiotech(students));

        System.out.println("\nAll students above age 20?");
        System.out.println(StudentService.allStudentsAbove20(students));

        System.out.println("\nNo student from Civil Engineering?");
        System.out.println(StudentService.noStudentFromCivil(students));
    }
}

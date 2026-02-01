package studentsProblem.GenderBasedAnalysis;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        System.out.println("1. Count Male & Female Students:");
        System.out.println(StudentService.countByGender(students));

        System.out.println("\n2. Average Age of Male Students:");
        System.out.println(StudentService.averageAgeOfMales(students));

        System.out.println("\n3. Average Age of Female Students:");
        System.out.println(StudentService.averageAgeOfFemales(students));

        System.out.println("\n4. Highest Ranked Male Student:");
        System.out.println(StudentService.highestRankedMale(students).orElse(null));

        System.out.println("\n5. Highest Ranked Female Student:");
        System.out.println(StudentService.highestRankedFemale(students).orElse(null));
    }
}

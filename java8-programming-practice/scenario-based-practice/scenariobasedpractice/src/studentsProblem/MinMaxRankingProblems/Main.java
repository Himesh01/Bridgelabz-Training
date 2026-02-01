package studentsProblem.MinMaxRankingProblems;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        System.out.println("1. Best Rank Holder:");
        System.out.println(StudentStreamOperations
                .bestRankHolder(students).orElse(null));

        System.out.println("\n2. Worst Rank Holder:");
        System.out.println(StudentStreamOperations
                .worstRankHolder(students).orElse(null));

        System.out.println("\n3. Second Best Rank Holder:");
        System.out.println(StudentStreamOperations
                .secondBestRankHolder(students).orElse(null));

        System.out.println("\n4. Third Best Rank Holder:");
        System.out.println(StudentStreamOperations
                .thirdBestRankHolder(students).orElse(null));

        System.out.println("\n5. Youngest Student:");
        System.out.println(StudentStreamOperations
                .youngestStudent(students).orElse(null));

        System.out.println("\n6. Oldest Student:");
        System.out.println(StudentStreamOperations
                .oldestStudent(students).orElse(null));
        
    }
}

package functionalInterface.FunctionDataTransformation.StudentMarks;

import java.util.function.Function;

public class StudentMain {
	public static void main(String[] args) {

        Function<Student, String> calculateGrade = student -> {
            if (student.marks >= 80) return "A";
            else if (student.marks >= 60) return "B";
            else return "C";
        };

        Student s1 = new Student("Himesh", 85);
        Student s2 = new Student("Raj", 65);
        Student s3 = new Student("Rajeev"
        		+ "", 50);

        System.out.println(s1.name + " Grade: " + calculateGrade.apply(s1));
        System.out.println(s2.name + " Grade: " + calculateGrade.apply(s2));
        System.out.println(s3.name + " Grade: " + calculateGrade.apply(s3));
    }
}

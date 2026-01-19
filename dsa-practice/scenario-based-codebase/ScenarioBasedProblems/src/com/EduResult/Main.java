package com.EduResult;

public class Main {

	public static void main(String[] args) {

        Student[] students = {
            new Student(101, "Lucky", 85),
            new Student(102, "Himesh", 92),
            new Student(103, "nag", 85),
            new Student(104, "Rajeev", 78),
            new Student(105, "Raj", 92)
        };

        RankSheetGenerator.mergeSort(students, 0, students.length - 1);

        System.out.println("State-Wise Rank List:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
package com.TreeGraph.UniversityRecordSystem;

public class Main {

    public static void main(String[] args) {
        StudentBST bst = new StudentBST();

        bst.insert(new Student(101, "Jiyan", "CS"));
        bst.insert(new Student(103, "Nobita", "EE"));
        bst.insert(new Student(102, "Himesh", "ME"));
        bst.insert(new Student(105, "Rajeev", "CS"));
        bst.insert(new Student(104, "Raj", "EE"));

        bst.displayInOrder();

        System.out.println("Searching for Roll No 103:");
        Student s = bst.search(103);
        System.out.println(s != null ? s : "Student not found.");

        System.out.println(" Deleting Roll No 102 (Himesh)");
        bst.delete(102);

        bst.displayInOrder();
    }
}
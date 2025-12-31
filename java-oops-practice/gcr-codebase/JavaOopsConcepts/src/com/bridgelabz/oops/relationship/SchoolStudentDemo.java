package com.bridgelabz.oops.relationship;

public class SchoolStudentDemo {

	public static void main(String[] args) {
        
        School school = new School("Jawahar Navodaya Vidyalaya");

        // Create students
        Student student1 = new Student("Nageshwar", 101);
        Student student2 = new Student("Lucky", 102);
        Student student3 = new Student("Himesh", 103);

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        // Create courses
        Course course1 = new Course("Math 101");
        Course course2 = new Course("Science 101");
        Course course3 = new Course("History 101");

        // Enroll students in courses
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course2);
        student2.enrollInCourse(course3);
        student3.enrollInCourse(course1);

        // Display students and their courses
        student1.showCourses();
        student2.showCourses();
        student3.showCourses();

        // Display students enrolled in each course
        course1.showStudents();
        course2.showStudents();
        course3.showStudents();

        // Display students in the school
        school.showStudents();
    }
}
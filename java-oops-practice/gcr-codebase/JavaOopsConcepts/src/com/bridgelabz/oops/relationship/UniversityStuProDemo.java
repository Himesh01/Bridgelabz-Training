package com.bridgelabz.oops.relationship;

public class UniversityStuProDemo {
public static void main(String[] args) {
		
	StudentUniversity student1 = new StudentUniversity("S101", "Lucky");
		StudentUniversity student2 = new StudentUniversity("S102", "Bob");

		
		ProfessorUni professor1 = new ProfessorUni("P201", "Dr. Smith");

		CourseUni course1 = new CourseUni("C301", "Data Structures");
		CourseUni course2 = new CourseUni("C302", "Operating Systems");

		student1.enrollCourses(course1);
		student1.enrollCourses(course2);
		student2.enrollCourses(course1);

		professor1.assignCourse(course1);
		professor1.assignCourse(course2);

		System.out.println("University Management System initialized successfully.");
	}
}

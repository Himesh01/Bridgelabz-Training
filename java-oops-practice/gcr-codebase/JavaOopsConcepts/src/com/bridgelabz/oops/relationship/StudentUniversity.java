package com.bridgelabz.oops.relationship;
import java.util.ArrayList;
import java.util.List;

public class StudentUniversity {
	private String studentId;
	private String name;
	private List<CourseUni> enrolledCourses = new ArrayList<>();
	
	public StudentUniversity(String studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}
	
	public void enrollCourses(CourseUni course) {
		enrolledCourses.add(course);
		course.addStudent(this);
	}
}

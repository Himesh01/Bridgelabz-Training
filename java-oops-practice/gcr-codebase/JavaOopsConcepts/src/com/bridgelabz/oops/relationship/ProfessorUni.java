package com.bridgelabz.oops.relationship;
import java.util.*;

public class ProfessorUni {
	private String professorId;
	private String name;
	private List<CourseUni> teachingCourses = new ArrayList<>();
	
	public ProfessorUni(String professorId, String name) {
		this.professorId = professorId;
		this.name = name;
	}
	
	public void assignCourse(CourseUni course) {
		teachingCourses.add(course);
		course.assignProfessor(this);
	}
}

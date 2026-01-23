package com.TreeGraph.UniversityRecordSystem;

public class Student {

	public String name;
	public String branch;
	public int rollNo;
	
	public Student(int rollNo, String name, String branch) {
		this.name = name;
		this.branch = branch;
		this.rollNo = rollNo;
	}
	
	@Override
	public String toString() {
		return "Roll No: "+rollNo+", Name: "+name+", Branch: "+branch;
	}
}
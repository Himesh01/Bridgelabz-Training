package com.TreeGraph.UniversityRecordSystem;

public class BstNode {
	Student student;
	BstNode left, right;
	
	public BstNode(Student student) {
		this.student = student;
		this.left = null;
		this.right = null;
	}
}

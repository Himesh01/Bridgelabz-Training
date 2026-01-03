package com.linkelist.studentrecord;


public class Student {
     public String name;
     public int rollno;
     public int age;
     public char grade;
     public Student next;
	  public Student(String name, int rollno, int age, char grade) {
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.grade = grade;
		this.next = null;
	  }
      
}

package javadesignpatternpractice.LibraryManagementSystem;

public class Student implements User {

	 private String name;
	
	 public Student(String name) {
	     this.name = name;
	 }
	
	 @Override
	 public void showRole() {
	     System.out.println(name + " is a Student.");
	 }
	
	 @Override
	 public void update(String message) {
	     System.out.println(name + " notified: " + message);
	 }
}

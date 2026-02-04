package javadesignpatternpractice.LibraryManagementSystem;

public class Faculty implements User {
	
	 private String name;
	
	 public Faculty(String name) {
	     this.name = name;
	 }
	
	 @Override
	 public void showRole() {
	     System.out.println(name + " is a Faculty.");
	 }
	
	 @Override
	 public void update(String message) {
	     System.out.println(name + " notified: " + message);
	 }
}


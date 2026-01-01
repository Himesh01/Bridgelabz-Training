package com.bridgelabz.oops.inheritance.hierarchicalinheritance.schoolsystem;

public class PersonMain {
	 public static void main(String[] args) {
		 System.out.println("--- 2026 School Directory ---");

		 Teacher t1 = new Teacher("Mr. Himesh", 42, "Mathematics");
		 Student s1 = new Student("Lucky Pal", 16, "12th Grade");
		 Staff st1 = new Staff("Nageshwar Prashad Patel", 50, "Administration");

		 t1.displayRole();
		 s1.displayRole();
		 st1.displayRole();	
	 }
}

package com.bridgelabz.oops.relationship;


public class UniversityDemo {
    public static void main(String[] args) {
        // Create University
        University university = new University("RGPV University");

        // Create Faculty
        Faculty faculty1 = new Faculty("Dr. Shashi Jain", 101);
        Faculty faculty2 = new Faculty("Dr. Arvind Kumar", 102);
        Faculty faculty3 = new Faculty("Dr. Monika Kumari", 103);

        // Create Departments
        UniversityDepartment dept1 = new UniversityDepartment("Computer Science");
        UniversityDepartment dept2 = new UniversityDepartment("Mathematics");

        // Assign Faculty to Departments
        dept1.addFaculty(faculty1);
        dept1.addFaculty(faculty2);
        dept2.addFaculty(faculty2);
        dept2.addFaculty(faculty3);

        // Add departments to the university
        university.addDepartment(dept1);
        university.addDepartment(dept2);

        // Show all departments and their faculty members
        university.showDepartments();

        // Display Faculty Members independently (independent of any department)
        System.out.println("\nDisplaying Faculty Members (independent of any department):");
        System.out.println(faculty1);
        System.out.println(faculty2);
        System.out.println(faculty3);
    }
}

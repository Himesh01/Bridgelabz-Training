package com.linkelist.studentrecord;

public class LinkList {
    Student head = null;
    
    public void addStudent(String name, int age,int rollno,char grade) {
   	Student student = new Student(name,rollno,age,grade); 
   	if(head== null) {
   		head = student;
   		System.out.println("Successfully added student "+student.name);
   		return; 
   	}
   	Student cur = head;
   	while(cur.next!=null) {
   		cur = cur.next;
   	}
   	cur.next = student;
   	System.out.println("Successfully added student "+student.name);		
   }
    public void addAtPosition(String name ,int age,int rollno,char grade, int addposition) {
   	 Student student = new Student(name,rollno,age,grade); 
   	 
   	 Student cur = head;
   	 while(cur.next!=null) {
   		 if(cur.rollno==addposition) {
   			 Student temp = cur.next;
   			 cur.next = student;
   			 student.next = temp;
   		System.out.println("Successfully added student "+student.name);		
   			 return;
   		 }
   		 cur= cur.next;
   	 }
   	 if(cur.rollno==addposition) {
			 Student temp = cur.next;
			 cur.next = student;
			 student.next = temp;
		  System.out.println("Successfully added student "+student.name);	
		  return;
		 }
   	System.out.println("The roll number not found"); 
    }
    
    public void deletestudent(int rollno) {
   	 Student cur = head;
   	 if(head==null) {
   		 System.out.println("List is empty");
   		 return;
   	 }
   	 Student perv = null;
   	 while(cur.next!=null) {
   		 if(cur.rollno==rollno) {
   			 if(perv==null) {
   				 head = cur.next;
   			 }else {
   				 perv = cur.next;
   			 }
   			 return;
   		 }
   		 perv = cur;
   		 cur = cur.next;
   	 }
    }
    public void search(int rollno) {
   	 Student stu = head;
   	 while(stu!=null) {
   		 if(stu.rollno==rollno) {
   			 System.out.println("--------Student Detail------");
   			 System.out.println("Name    : "+stu.name);
   			 System.out.println("Age     : "+stu.age);
   			 System.out.println("Rollno  : "+stu.rollno);
   			 System.out.println("Grade   : "+stu.grade);
   			 return;
   		 }
   		 stu = stu.next;
   	 }
   	 System.out.println("Student not found");
    }
    public void displayAll() {
   	 Student stu = head;
   	 while(stu!=null) {
   			 System.out.println("----------------------------");
   			 System.out.println("Name    : "+stu.name);
   			 System.out.println("Age     : "+stu.age);
   			 System.out.println("Rollno  : "+stu.rollno);
   			 System.out.println("Grade   : "+stu.grade);
   		 stu = stu.next;
   	 }
    }
    public void updateGrade(int rollno,char grade) {
   	 Student stu = head;
   	 while(stu!=null) {
   		 if(stu.rollno==rollno) {
   			stu.grade = grade;
   			System.out.println("Grade update successfully");
   			return;
   		 }
   		 stu = stu.next;
   	 }
   	 System.out.println("Student not found");
    
    }
    public void atPosition(String name, int age, int rollno,char grade, int position) {
   	Student student = new Student(name,rollno,age,grade);
   	int idx =0;
   	if(position==0&&head==null) {
   		head = student;
   	}
   	 Student cur = head;
   	 Student perv =null;
   	 while(cur!=null) {
   		 if(idx==position) {
   			 if(perv==null) {
   				student.next= head;
   			   head = student;
   			 }else {
   				 perv.next = student;
   				 student.next = cur;
   			 }
   			 return;
   		 }
   		 idx++;
   		
   		 perv = cur;
   		 cur = cur.next;
   	 }
   
   	 System.out.println("Index out of bound");
    }
}

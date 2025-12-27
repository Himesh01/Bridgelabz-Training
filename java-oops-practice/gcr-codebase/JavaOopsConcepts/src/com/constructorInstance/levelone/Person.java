package com.constructorInstance.levelone;

import java.util.*;
public class Person {

    private String name;
    private int age;

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        System.out.println("Copy Constructor: Created clone of " + other.name);
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter p1 name :");
   	  String p1 = sc.nextLine();
   	  
   	  System.out.println("Enter p1 age :");
   	  int age1 = sc.nextInt();
   	  
   	  Person p = new Person(p1,age1);
   	  System.out.println("Name : "+p.name +", Age :" + p.age);
   	  
   	  
   	  Person p2 = new Person(p);
   	  System.out.println("Name : "+p2.name);
   	  System.out.println("Age : "+p2.age);
    }

}

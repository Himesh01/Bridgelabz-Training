package functionalInterface.PredicateConditionChecking.studentSystem;

import java.util.function.Predicate;

public class StudentMain {
	public static void main(String[] args) {
		
		Predicate<Student> isEligible = s -> s.attendance >= 75;
		
		Student s1 = new Student("Himesh",88);
		Student s2 = new Student("Nag",57);
		
		System.out.println(isEligible.test(s1));
		System.out.println(isEligible.test(s2));
	}
}

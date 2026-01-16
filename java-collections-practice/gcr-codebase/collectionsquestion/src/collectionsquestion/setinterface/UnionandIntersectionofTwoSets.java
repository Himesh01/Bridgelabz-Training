package collectionsquestion.setinterface;
import java.util.*;

public class UnionandIntersectionofTwoSets {
	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
		Set<Integer> set2 = new HashSet<>(Set.of(3, 4, 5));
		
		Set<Integer> union = new HashSet<>(set1);
		union.addAll(set2);
		
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		
		System.out.println("Set1: " + set1);
		System.out.println("Set2: " + set2);
		System.out.println("Union: " + union);
		System.out.println("Intersection: " + intersection);
	}
}

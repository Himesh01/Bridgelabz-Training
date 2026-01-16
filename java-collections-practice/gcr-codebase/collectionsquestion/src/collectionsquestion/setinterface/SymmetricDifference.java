package collectionsquestion.setinterface;
import java.util.*;

public class SymmetricDifference {
	public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {

        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        result.removeAll(intersection);

        return result;
    }

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(3, 4, 5));

        Set<Integer> output = symmetricDifference(set1, set2);

        System.out.println("Symmetric Difference: " + output);
    }
}

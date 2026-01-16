package collectionsquestion.setinterface;

import java.util.HashSet;
import java.util.Set;

public class SubsetCheck {

    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
        return set2.containsAll(set1);
    }

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        boolean result = isSubset(set1, set2);

        System.out.println("Is Set1 subset of Set2? " + result);
    }
}
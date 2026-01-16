package collectionsquestion.listinterface;
import java.util.*;

public class RemoveDuplicates {

    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> set = new LinkedHashSet<>(list); // preserves insertion order
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(3, 1, 2, 2, 3, 4);
        
        System.out.println("Input: "+ input);
        List<Integer> result = removeDuplicates(input);

        System.out.println("After removing duplicates: " +result);
    }
}
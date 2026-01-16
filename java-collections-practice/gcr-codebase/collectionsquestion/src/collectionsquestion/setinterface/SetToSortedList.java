package collectionsquestion.setinterface;
import java.util.*;

public class SetToSortedList {
	public static List<Integer> convertAndSort(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set); 
        Collections.sort(list);                   
        return list;
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Set.of(5, 3, 9, 1));

        List<Integer> sortedList = convertAndSort(set);

        System.out.println(sortedList);
    }
}

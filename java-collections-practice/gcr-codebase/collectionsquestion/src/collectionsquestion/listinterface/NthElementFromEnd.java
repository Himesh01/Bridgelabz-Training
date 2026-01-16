package collectionsquestion.listinterface;
import java.util.LinkedList;
import java.util.ListIterator;

public class NthElementFromEnd {

    public static String findNthFromEnd(LinkedList<String> list, int n) {
        if (list == null || list.isEmpty() || n <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        ListIterator<String> fast = list.listIterator();
        ListIterator<String> slow = list.listIterator();

        for (int i = 0; i < n; i++) {
            if (!fast.hasNext()) {
                throw new IllegalArgumentException("N is greater than list size");
            }
            fast.next();
        }

        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }
        return slow.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("2nd from end: " + findNthFromEnd(list, 2)); // D
    }
}
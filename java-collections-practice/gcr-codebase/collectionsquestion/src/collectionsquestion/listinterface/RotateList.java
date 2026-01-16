package collectionsquestion.listinterface;
import java.util.*;

public class RotateList {

    public static void reverse(List<Integer> list, int start, int end) {
        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }

    public static void rotateLeft(List<Integer> list, int k) {
        int n = list.size();
        k = k % n;   

        reverse(list, 0, k - 1);

        reverse(list, k, n - 1);

        reverse(list, 0, n - 1);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        System.out.println("Before: " + arr);

        rotateLeft(arr, 2);

        System.out.println("After:  " + arr);
    }
}
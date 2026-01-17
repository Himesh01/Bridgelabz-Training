package collectionsquestion.queueinterface;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryGenerator {

    public static void generateBinary(int n) {

        Queue<String> q = new LinkedList<>();

        q.add("1");

        System.out.println("Binary numbers:");

        for (int i = 0; i < n; i++) {
       
            String curr = q.remove();
            System.out.print(curr + " ");

            q.add(curr + "0");
            q.add(curr + "1");
        }
    }

    public static void main(String[] args) {
        int N = 5;
        generateBinary(N);
    }
}
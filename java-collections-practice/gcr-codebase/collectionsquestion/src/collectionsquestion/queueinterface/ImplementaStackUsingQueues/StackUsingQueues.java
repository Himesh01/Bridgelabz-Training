package collectionsquestion.queueinterface.ImplementaStackUsingQueues;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
	Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int top = q1.remove();

        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }

    public int top() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int top = q1.peek();
        q2.add(q1.remove());

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }
}

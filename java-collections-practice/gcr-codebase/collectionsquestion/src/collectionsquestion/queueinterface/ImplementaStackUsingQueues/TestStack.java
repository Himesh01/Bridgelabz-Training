package collectionsquestion.queueinterface.ImplementaStackUsingQueues;

public class TestStack {
    public static void main(String[] args) {

        StackUsingQueues stack = new StackUsingQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top()); 
        System.out.println("Popped: " + stack.pop());    
        System.out.println("New top: " + stack.top());   
    }
}
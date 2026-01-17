package collectionsquestion.queueinterface.CircularBufferSimulation;

public class CircularBuffer {
	 private int[] buffer;
	    private int front;
	    private int rear;
	    private int size;
	    private int capacity;

	    public CircularBuffer(int capacity) {
	        this.capacity = capacity;
	        buffer = new int[capacity];
	        front = 0;
	        rear = 0;
	        size = 0;
	    }

	    public void insert(int x) {
	        buffer[rear] = x;
	        rear = (rear + 1) % capacity;

	        if (size == capacity) {
	            front = (front + 1) % capacity;
	        } else {
	            size++;
	        }
	    }

	    public void display() {
	        System.out.print("Buffer: [");
	        for (int i = 0; i < size; i++) {
	            int index = (front + i) % capacity;
	            System.out.print(buffer[index]);
	            if (i < size - 1) System.out.print(", ");
	        }
	        System.out.println("]");
	    }
}

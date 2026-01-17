package collectionsquestion.queueinterface.CircularBufferSimulation;

public class TestCircularBuffer {
	 public static void main(String[] args) {

	        CircularBuffer cb = new CircularBuffer(3);

	        cb.insert(1);
	        cb.insert(2);
	        cb.insert(3);
	        cb.display();   

	        cb.insert(4);   
	        cb.display();  
	    }
}

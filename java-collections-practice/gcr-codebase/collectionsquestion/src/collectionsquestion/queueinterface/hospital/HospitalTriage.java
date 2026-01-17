package collectionsquestion.queueinterface.hospital;
import java.util.PriorityQueue;

public class HospitalTriage {
	public static void main(String[] args) {

        PriorityQueue<Patient> pq = new PriorityQueue<>(
                (p1, p2) -> p2.getSeverity() - p1.getSeverity());

        pq.add(new Patient("Himesh", 3));
        pq.add(new Patient("Rajeev", 5));
        pq.add(new Patient("Raj", 2));

        System.out.println("Treatment Order:");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); 
        }
    }
}

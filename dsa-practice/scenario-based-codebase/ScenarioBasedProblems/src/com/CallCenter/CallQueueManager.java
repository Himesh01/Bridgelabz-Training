package com.CallCenter;
import java.util.*;

public class CallQueueManager {
	private Queue<Customer> normalQueue;
	private PriorityQueue<Customer> vipQueue;
	private HashMap<String, Integer> callCountMap;
	
	public CallQueueManager() {
		normalQueue = new LinkedList<>();
		vipQueue = new PriorityQueue<>(
                (c1, c2) -> c1.getName().compareTo(c2.getName())
        );
        callCountMap = new HashMap<>();
	}
	//method for adding Customer call
	public void addCall(Customer customer) {
		if(customer.isVip()) {
			vipQueue.add(customer);
		}else {
			normalQueue.add(customer);
		}
		// update call count
		callCountMap.put(
				customer.getId(),
				callCountMap.getOrDefault(customer.getId(),0)+1
		);
	}
	// method to serve next call
	public void serveNextCall() {
		if(!vipQueue.isEmpty()) {
			Customer customer = vipQueue.poll();
			System.out.println("Serving Vip Customer " +customer.getName());
		}
		else if(normalQueue.isEmpty()) {
			Customer customer = normalQueue.poll();
            System.out.println("Serving Normal Customer: " + customer.getName());
        }
		else {
            System.out.println("No calls in queue.");
        }
	}
	
	public void displayCallStats() {
		
        System.out.println("\nCustomer Call Count (Monthly):");
        for (Map.Entry<String, Integer> entry : callCountMap.entrySet()) {
            System.out.println("Customer ID: " + entry.getKey() +
                               " | Calls: " + entry.getValue());
        }
    }
}

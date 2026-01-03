package com.linkelist.roundrobin;

public class RoundRobinScheduler {
	 private ProcessNode head = null;

	  
	 public void addProcess(int pid, int burstTime, int priority) {
		 ProcessNode newNode = new ProcessNode(pid, burstTime, priority);
		 
		 if (head == null) {
			 head = newNode;
			 newNode.next = head;
			 return;
		 }

		 ProcessNode temp = head;
		 while (temp.next != head) {
			 temp = temp.next;
		 }
		 
		 temp.next = newNode;
		 newNode.next = head;
	 }

	   

	 private void removeProcess(ProcessNode target) {

		 if (head == target && head.next == head) {
			 head = null;
			 return;
		 }

		 ProcessNode prev = head;
		 while (prev.next != target) {
			 prev = prev.next;
		 }

		 prev.next = target.next;

		 if (target == head) {
			 head = target.next;
		 }
	 }

	   

	 public void simulate(int timeQuantum) {

		 if (head == null) {
			 System.out.println("No processes to schedule");
			 return;
		 }

		 int currentTime = 0;
		 int totalWaitingTime = 0;
		 int totalTurnaroundTime = 0;
		 int processCount = countProcesses();
		 
		 ProcessNode curr = head;
		 
		 while (head != null) {
			 
			 displayProcesses();

			 if (curr.remainingTime > 0) {
				 
				 int execTime = Math.min(curr.remainingTime, timeQuantum);
				 curr.remainingTime -= execTime;
				 currentTime += execTime;
				 
				 
				 ProcessNode temp = head;
				 do {
					 if (temp != curr && temp.remainingTime > 0) {
						 temp.waitingTime += execTime;
					 }
					 temp = temp.next;
				 } while (temp != head);
				 
				 
				 if (curr.remainingTime == 0) {
					 curr.turnaroundTime = currentTime;
					 totalWaitingTime += curr.waitingTime;
					 totalTurnaroundTime += curr.turnaroundTime;

					 ProcessNode completed = curr;
					 curr = curr.next;
					 removeProcess(completed);
					 continue;
				 }
			 }

			 curr = curr.next;
		 }

		 System.out.println("\n--- Scheduling Complete ---");
		 System.out.println("Average Waiting Time: " +
				 (double) totalWaitingTime / processCount);
	        System.out.println("Average Turnaround Time: " +
	        		(double) totalTurnaroundTime / processCount);
	    }

	 private void displayProcesses() {
		 if (head == null) {
			 System.out.println("Queue Empty");
			 return;
		 }

		 ProcessNode temp = head;
		 System.out.print("Current Queue: ");
		 do {
			 System.out.print("[PID:" + temp.pid +
					 " RT:" + temp.remainingTime + "] -> ");
			 temp = temp.next;
		 } while (temp != head);
		 System.out.println("(back to head)");
	 }

	   

	 private int countProcesses() {
		 if (head == null) return 0;
		 
		 int count = 0;
		 ProcessNode temp = head;
		 do {
			 count++;
			 temp = temp.next;
		 } while (temp != head);

		 return count;
	 }
}

package com.linkelist.roundrobin;

public class ProcessNode {
	 int pid;
	 int burstTime;
	 int remainingTime;
	 int priority;
	 
	 int waitingTime;
	 int turnaroundTime;

	 ProcessNode next;
	 
	 ProcessNode(int pid, int burstTime, int priority) {
		 this.pid = pid;
		 this.burstTime = burstTime;
		 this.remainingTime = burstTime;
		 this.priority = priority;
		 this.waitingTime = 0;
		 this.turnaroundTime = 0;
		 this.next = null;
	 }
}	

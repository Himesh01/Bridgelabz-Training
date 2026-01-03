package com.linkelist.roundrobin;

public class Main {
	public static void main(String[] args) {

        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        scheduler.addProcess(1, 10, 2);
        scheduler.addProcess(2, 5, 1);
        scheduler.addProcess(3, 8, 3);

        int timeQuantum = 3;

        scheduler.simulate(timeQuantum);
    }
}

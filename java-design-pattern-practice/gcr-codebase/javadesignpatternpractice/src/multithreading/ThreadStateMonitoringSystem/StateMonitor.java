package multithreading.ThreadStateMonitoringSystem;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class StateMonitor implements Runnable {
    private final List<Thread> threads;
    private static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm:ss");
    private static final long MONITOR_INTERVAL_MS = 500;

    public StateMonitor(Thread... threads) {
	this.threads = Arrays.asList(threads);
    }

    @Override
    public void run() {
	System.out.println("[Monitor] Starting thread state monitoring...");

	Thread.State[] prevStates = new Thread.State[threads.size()];
	int[] stateCounts = new int[threads.size()];

	while (true) {

	    LocalTime now = LocalTime.now();
	    String timestamp = now.format(TIME_FORMAT);

	    int terminatedNow = 0;

	    for (int i = 0; i < threads.size(); i++) {
		Thread t = threads.get(i);
		Thread.State currentState = t.getState();

		if (prevStates[i] == null || prevStates[i] != currentState) {
		    System.out.printf("[Monitor] %s is in %s state at %s%n", t.getName(), currentState, timestamp);
		    stateCounts[i]++;
		    prevStates[i] = currentState;
		}

		if (currentState == Thread.State.TERMINATED) {
		    terminatedNow++;
		}
	    }

	    if (terminatedNow >= threads.size()) {
		break;
	    }

	    try {
		Thread.sleep(MONITOR_INTERVAL_MS);
	    } catch (InterruptedException e) {
		Thread.currentThread().interrupt();
		System.out.println("[Monitor] Monitoring interrupted!");
		return;
	    }
	}

	System.out.println("\n====== Monitoring Complete ======");
	printSummary(stateCounts);
    }

    private void printSummary(int[] stateCounts) {
	for (int i = 0; i < threads.size(); i++) {
	    Thread t = threads.get(i);
	    int uniqueStates = stateCounts[i];
	    System.out.printf("Summary: %s went through %d state%s%n", t.getName(), uniqueStates,
		    uniqueStates == 1 ? "" : "s");
	}
    }
}
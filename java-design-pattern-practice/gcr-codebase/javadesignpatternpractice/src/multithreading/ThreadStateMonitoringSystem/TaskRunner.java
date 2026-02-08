package multithreading.ThreadStateMonitoringSystem;

public class TaskRunner implements Runnable {
    private final String name;

    public TaskRunner(String name) {
	this.name = name;
    }

    @Override
    public void run() {
	try {
	    System.out.println("[" + name + "] Starting task...");

	    long start = System.currentTimeMillis();
	    while (System.currentTimeMillis() - start < 1500) {
		// Busy work to stay in RUNNABLE
		Math.sqrt(Math.random() * Math.random());
	    }

	    System.out.println("[" + name + "] Going to sleep for 2 seconds...");
	    Thread.sleep(2000);

	    for (int i = 0; i < 800_000; i++) {
		Math.cbrt(i);
	    }

	    System.out.println("[" + name + "] Task completed.");
	} catch (InterruptedException e) {
	    Thread.currentThread().interrupt();
	    System.out.println("[" + name + "] Interrupted during sleep!");
	}
    }

    public String getName() {
	return name;
    }
}
package multithreading.PrintShopJobSchedular;

public class PrintJob implements Runnable {
    private final String jobName;
    private final int totalPages;
    private final int priority;

    public PrintJob(String jobName, int pages, int priority) {
	this.jobName = jobName;
	this.totalPages = pages;
	this.priority = Math.max(1, Math.min(10, priority));
    }

    public int getPriority() {
	return priority;
    }

    @Override
    public void run() {
	Thread current = Thread.currentThread();
	current.setPriority(priority);

	String priorityLabel = getPriorityLabel(priority);

	System.out.println("[" + priorityLabel + "] Starting job: " + getJobName() + " (" + totalPages + " pages, priority "
		+ priority + ")");

	try {
	    for (int page = 1; page <= totalPages; page++) {

		Thread.sleep(100);

		System.out.printf("[%s] Printing %s - Page %d of %d%n", priorityLabel, getJobName(), page, totalPages);

		if (Math.random() < 0.15) {
		    Thread.yield();
		}
	    }

	    System.out.println("[" + priorityLabel + "] Completed: " + getJobName());

	} catch (InterruptedException e) {
	    System.out.println("[" + getJobName() + "] Printing interrupted!");
	    Thread.currentThread().interrupt();
	}
    }

    private String getPriorityLabel(int prio) {
	if (prio >= 8)
	    return "High Priority";
	if (prio >= 5)
	    return "Medium Priority";
	return "Low Priority";
    }

    public String getJobName() {
	return jobName;
    }
}
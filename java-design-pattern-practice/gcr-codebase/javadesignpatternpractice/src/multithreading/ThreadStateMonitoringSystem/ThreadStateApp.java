package multithreading.ThreadStateMonitoringSystem;

public class ThreadStateApp {
    public static void main(String[] args) {
    	
        TaskRunner task1 = new TaskRunner("Task-1");
        TaskRunner task2 = new TaskRunner("Task-2");

        Thread t1 = new Thread(task1, "Task-1");
        Thread t2 = new Thread(task2, "Task-2");

        StateMonitor monitor = new StateMonitor(t1, t2);
        Thread monitorThread = new Thread(monitor, "Monitor");

        System.out.println("====== Thread State Monitor ======\n");

        monitorThread.start();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
            monitorThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted");
        }

        System.out.println("\nAll threads have completed.");
    }
}
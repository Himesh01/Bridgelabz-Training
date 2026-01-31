package functionalInterface.backgroundJobExecution;

public class BackgroundJobExecution {

    public static void main(String[] args) {

        Runnable backgroundJob = () -> {
            System.out.println("Job running in: " +
                    Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Job finished");
        };

        Thread worker = new Thread(backgroundJob);
        worker.start();

        System.out.println("Main thread continues...");
    }
}

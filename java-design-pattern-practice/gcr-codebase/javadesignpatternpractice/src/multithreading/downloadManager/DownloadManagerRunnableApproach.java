package multithreading.downloadManager;

public class DownloadManagerRunnableApproach {
    
    public static void main(String[] args) {
        System.out.println("=== Download Manager (Runnable interface approach) ===\n");
        
        // Create runnable tasks
        Runnable task1 = new FileDownloaderRunnable("Document.pdf");
        Runnable task2 = new FileDownloaderRunnable("Image.jpg");
        Runnable task3 = new FileDownloaderRunnable("Video.mp4");
        
        // Create threads and give meaningful names
        Thread t1 = new Thread(task1, "Downloader-1");
        Thread t2 = new Thread(task2, "Downloader-2");
        Thread t3 = new Thread(task3, "Downloader-3");
        
        // Start all downloads
        t1.start();
        t2.start();
        t3.start();
        
        // Wait for all threads to complete
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        
        System.out.println("\nAll downloads complete!");
    }
}
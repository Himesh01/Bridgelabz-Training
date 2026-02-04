package multithreading.downloadManager;

public class DownloadManagerThreadApproach {
    
    public static void main(String[] args) {
        System.out.println("=== Download Manager (Thread class approach) ===\n");
        
        // Create downloaders
        FileDownloaderThread d1 = new FileDownloaderThread("Document.pdf");
        FileDownloaderThread d2 = new FileDownloaderThread("Image.jpg");
        FileDownloaderThread d3 = new FileDownloaderThread("Video.mp4");
        
        // Set custom names (makes output cleaner)
        d1.setName("Downloader-1");
        d2.setName("Downloader-2");
        d3.setName("Downloader-3");
        
        // Start all downloads
        d1.start();
        d2.start();
        d3.start();
        
        // Wait for all threads to finish
        try {
            d1.join();
            d2.join();
            d3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        
        System.out.println("\nAll downloads complete!");
    }
}
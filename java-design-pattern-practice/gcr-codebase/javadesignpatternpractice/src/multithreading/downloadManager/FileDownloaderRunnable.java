package multithreading.downloadManager;

public class FileDownloaderRunnable implements Runnable {
	 private final String fileName;
	
	 public FileDownloaderRunnable(String fileName) {
	     this.fileName = fileName;
	 }
	
	 @Override
	 public void run() {
	     String threadName = Thread.currentThread().getName();
	
	     try {
	         System.out.println("[" + threadName + "] Starting download: " + fileName);
	
	         for (int progress = 0; progress <= 100; progress += 5) {
	             Thread.sleep((int) (Math.random() * 300) + 100);
	             System.out.println("[" + threadName + "] Downloading " + fileName + ": " + progress + "%");
	         }
	         System.out.println("[" + threadName + "] Completed: " + fileName);
	     } 
	     catch (InterruptedException e) {
	         System.out.println("[" + threadName + "] Download interrupted: " + fileName);
	     }
	 }
}
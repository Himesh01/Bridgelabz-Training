package multithreading.downloadManager;

public class FileDownloaderThread extends Thread {
	 private final String fileName;
	
	 public FileDownloaderThread(String fileName) {
	     this.fileName = fileName;
	 }
	
	 @Override
	 public void run() {
	     try {
	         System.out.println("[" + getName() + "] Starting download: " + fileName);
	
	         for (int progress = 0; progress <= 100; progress += 5) {
	             Thread.sleep((int) (Math.random() * 300) + 100);
	             System.out.println("[" + getName() + "] Downloading " + fileName + ": " + progress + "%");
	         }
	         System.out.println("[" + getName() + "] Completed: " + fileName);
	     }
	     catch (InterruptedException e) {
	         System.out.println("[" + getName() + "] Download interrupted: " + fileName);
	     }
	 }
}

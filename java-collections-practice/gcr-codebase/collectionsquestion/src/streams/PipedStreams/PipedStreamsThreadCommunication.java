package streams.PipedStreams;
import java.io.*;

public class PipedStreamsThreadCommunication {
	    public static void main(String[] args) {

	        try {
	            PipedOutputStream pos = new PipedOutputStream();
	            PipedInputStream pis = new PipedInputStream(pos);
	            Thread writerThread = new Thread(() -> {
	                try {
	                    String message = "Hello from Writer Thread!";
	                    System.out.println("Writer: Sending data...");

	                    pos.write(message.getBytes());
	                    pos.close(); 

	                } catch (IOException e) {
	                    System.out.println("Writer Error: " + e.getMessage());
	                }
	            });

	            Thread readerThread = new Thread(() -> {
	                try {
	                    BufferedReader br =
	                            new BufferedReader(new InputStreamReader(pis));

	                    System.out.println("Reader: Waiting for data...");

	                    String line;
	                    while ((line = br.readLine()) != null) {
	                        System.out.println("Reader received: " + line);
	                    }

	                    br.close();

	                } catch (IOException e) {
	                    System.out.println("Reader Error: " + e.getMessage());
	                }
	            });

	            readerThread.start();
	            writerThread.start();

	            writerThread.join();
	            readerThread.join();

	        } catch (Exception e) {
	            System.out.println("Main Error: " + e.getMessage());
	        }
	    }
	}
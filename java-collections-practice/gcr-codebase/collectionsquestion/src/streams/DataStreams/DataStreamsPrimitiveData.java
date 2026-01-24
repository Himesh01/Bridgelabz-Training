package streams.DataStreams;
import java.io.*;

public class DataStreamsPrimitiveData {

	    private static final String FILE_NAME = "student.dat";

	    public static void main(String[] args) {
	        writeStudentData();  
	        readStudentData();
	    }

	    public static void writeStudentData() {

	        try (DataOutputStream dos =
	                     new DataOutputStream(new FileOutputStream(FILE_NAME))) {

	            int rollNo = 101;
	            String name = "Himesh";
	            double gpa = 8.75;

	            dos.writeInt(rollNo);     
	            dos.writeUTF(name);     
	            dos.writeDouble(gpa);     

	            System.out.println("Student data written successfully to " + FILE_NAME);

	        } catch (IOException e) {
	            System.out.println("Write Error: " + e.getMessage());
	        }
	    }
	    public static void readStudentData() {

	        try (DataInputStream dis =
	                     new DataInputStream(new FileInputStream(FILE_NAME))) {

	            int rollNo = dis.readInt();
	            String name = dis.readUTF();
	            double gpa = dis.readDouble();

	            System.out.println("\nRetrieved Student Details:");
	            System.out.println("Roll No: " + rollNo);
	            System.out.println("Name   : " + name);
	            System.out.println("GPA    : " + gpa);

	        } catch (IOException e) {
	            System.out.println("Read Error: " + e.getMessage());
	        }
	    }
	}
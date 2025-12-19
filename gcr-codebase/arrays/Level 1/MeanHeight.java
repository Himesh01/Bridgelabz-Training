
import java.util.Scanner;;

public class MeanHeight{
	public static void main(String[] args){
	
	Scanner sc =new Scanner (System.in);
	double[] arr = new double[11];
	
	for(int i =0; i<arr.length; i++){
		arr[i]= sc.nextInt();
	}
	double sum =0;
	for(int i =0; i<arr.length;i++){
		sum= sum+arr[i];
	}
	double mean = sum /11;
	System.out.println("the mean height of the football team "+ mean);
	}
}
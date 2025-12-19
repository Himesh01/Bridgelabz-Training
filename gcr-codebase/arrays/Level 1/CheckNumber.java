import java.util.Scanner;;

public class CheckNumber{
	public static void main(String[] args){
	
	Scanner sc =new Scanner (System.in);
	int[] arr = new int[5];
	
	for(int i =0; i<arr.length; i++){
		arr[i]= sc.nextInt();
	}
		for(int i =0; i < arr.length;i++){
			if(arr[i]<0){
				System.out.println("Negative");
			}
			else if(arr[i] ==0){
				System.out.println("Zero");
			}
			else{
				if(arr[i] %2 ==0){
					System.out.println("Even");
				}
				else{
					System.out.println("Odd");
				}
			}	
		}
		if(arr[0]== arr.length-1){
			System.out.println("Equal");
		}
		else if(arr[0] < arr.length-1){
			System.out.println("Less");
		}
		else{
			System.out.println("Greater");
		}
	}
}
			
import java.util.Scanner;

public class CountDigit{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
		
		int count =0;
		
		if(number == 0){
			count =1;
		}
		else{
			while(number !=0){
				number = number /10;
				count++;
			}
		}
		System.out.println("Count : "+ count);
	}
}
				
	
		
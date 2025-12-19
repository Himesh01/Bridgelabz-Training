import java.util.Scanner;;

public class Multiplication{
	public static void main(String[] args){
	
		Scanner sc =new Scanner (System.in);
		int number = sc.nextInt();
		int[] arr = new int[10];
		int ans = 0;
		for(int i =1; i<=10; i++){
			ans = number * i;
			arr[i-1] = ans;
		}
		for(int i =1; i<=10; i++){
		System.out.println(number+" * "+i+" = "+ arr[i-1]);
		}
	}
}
	
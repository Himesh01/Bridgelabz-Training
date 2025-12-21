import java.util.*;
public class Roots{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("The root are "+Arrays.toString(findRoot(a,b,c)));
	}
	public static int[] findRoot(int a, int b, int c){
		int delta = (b*b)-4*a*c;
		int [] arr =new int[2];
		if(delta>0){
			arr[0]=(-b+((int)Math.sqrt(delta)))/(2*a);
			arr[1]=(-b-((int)Math.sqrt(delta)))/(2*a);
		}else if(delta==0){
			arr[0]=(-b/(2*a));
		}
		return arr;
	}
}
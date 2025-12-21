import java.util.*;
public class FriendsComparision{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter deatils");
		
		int [] age = new int[3];
		float [] height = new float[3];
		
		System.out.println("Enter the ages :");
		for(int i =0;i<3;i++){
			age[i] = sc.nextInt();
		}
		System.out.println("Enter the Height :");
		for(int i =0;i<3;i++){
			height[i] = sc.nextInt();
		}
		
	   System.out.println("The youngest person age is "+smallestAge(age));
	   System.out.println("The tallest person height is "+tallestHeight(height));
	}
	public static int smallestAge(int[] age){
		int min =age[0];
		for(int i :age){
			min = Math.min(min,i);
		}
		return min;
	}
	
	public static float tallestHeight(float[] height){
		float max = height[0];
		for(float a :height){
			max = Math.max(max,a);
		}
		return max;
	}
}
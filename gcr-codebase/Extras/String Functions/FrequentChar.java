import java.util.*;
public class FrequentChar{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String s = sc.next();
		
		System.out.println("The Most Frequent Character is "+frequent(s));
	}
	
	public static char frequent(String s){
		int [] arr = new int[256];
		
		
		for(char a : s.toCharArray()){
		arr[a]+=1;
		}
		int idx =0;
		int max =0;
		for(int i =0;i<256;i++){
			if(max<arr[i]){
				max = arr[i];
				idx =i;
			}
		}
		return (char)(idx);
	}
}
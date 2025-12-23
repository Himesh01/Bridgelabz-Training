import java.util.*;

public class ReplaceChar{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter sentence ");
		String sen = sc.nextLine();
		
		System.out.println("Enter word ");
		String word = sc.next();
		
		System.out.println("Enter replacing word ");
		String rep = sc.next();
		
		System.out.println("The sentence after replacement is : "+replace(sen,word,rep));
	}
	public static String replace(String s,String word,String rep){
		String[] arr = s.split(" ");
		String str = "";
		for(int i =0;i<arr.length;i++){
			if(arr[i].equals(word)){
				arr[i] = rep;
			}
			if(i!=arr.length-1){
				str+=arr[i]+" ";
			}else{
				str+=arr[i];
			}
		}
		return str;
	}
}
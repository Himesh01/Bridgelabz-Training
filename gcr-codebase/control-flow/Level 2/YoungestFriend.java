import java.util.Scanner;

public class YoungestFriend{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		int age1 = sc.nextInt();
		int age2 = sc.nextInt();
		int age3 = sc.nextInt();
		int height1 = sc.nextInt();
		int height2 = sc.nextInt();
		int height3 = sc.nextInt();
		
		if(age1<age2 && age1<age3){
			System.out.println("Youngest Friend is Amar");
		} 
		else if(age2<age1 && age2 < age3){
			System.out.println("Youngest friend is Akbar");
		}else{
			System.out.println("Youngest friend is Anthony");
		}
		if(height1>height2 && height1 > height3){
			System.out.println("Tallest friend is Amar");
		}else if(height2>height1 && height2>height3){
			System.out.println("Tallest friend is Akbar");
		}else{
			System.out.println("Tallest friend is Anthony");
		}
	}
}
		
		
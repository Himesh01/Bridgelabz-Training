import java.util.Scanner;
public class TotalPrice{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		float unitPrice = sc.nextInt();
		int quantity = sc.nextInt();
		double totalPurchase = unitPrice * quantity;
		
		System.out.println("The total purchase price is INR "+unitPrice+" if the quantity "+quantity+" and unit price is INR "+ totalPurchase);
	}
}
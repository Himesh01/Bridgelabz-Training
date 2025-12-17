import java.util.Scanner;
public class FeesDiscount{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Tution fees");
	float tutionFees = sc.nextFloat();
		System.out.println("Enter Discount");

	float discount = sc.nextFloat();
	float discountFees = tutionFees * discount /100;
	float feesAfterDiscount = tutionFees - discountFees;
	System.out.println(" The discount amount is INR "+ discountFees+ " and final discounted fee is INR " + feesAfterDiscount);
	}
}
	
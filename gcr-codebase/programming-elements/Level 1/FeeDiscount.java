public class FeeDiscount{
	public static void main(String[]args){
	float tutionFees = 125000;
	float discount =10;
	float discountFees = tutionFees * discount /100;
	float feesAfterDiscount = tutionFees - discountFees;
	System.out.println(" The discount amount is INR "+ discountFees+ " and final discounted fee is INR " + feesAfterDiscount);
	}
}
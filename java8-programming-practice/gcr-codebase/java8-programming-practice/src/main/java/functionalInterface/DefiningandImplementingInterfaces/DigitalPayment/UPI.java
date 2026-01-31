package functionalInterface.DefiningandImplementingInterfaces.DigitalPayment;

public class UPI implements Payment{
	public double upiAmount;
	public String upiId;
	
	public UPI(String upiId, double upiAmount) {
		this.upiId = upiId;
		this.upiAmount = upiAmount;
	}
	
	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		if(amount<=upiAmount) {
			upiAmount-=amount;
			System.out.println("upi payment done\n");
		}
		else {
			System.out.println("Insufficient amount\n");
		}
	}
}
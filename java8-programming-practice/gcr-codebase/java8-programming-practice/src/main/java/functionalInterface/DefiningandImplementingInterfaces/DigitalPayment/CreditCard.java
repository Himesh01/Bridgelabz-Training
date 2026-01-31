package functionalInterface.DefiningandImplementingInterfaces.DigitalPayment;

public class CreditCard implements Payment {
	public double cardBalance;
	public String cardNumber;
	
	public CreditCard(String cardNumber, double cardBalance) {
		this.cardBalance = cardBalance;
		this.cardNumber = cardNumber;
	}

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		if(amount<=cardBalance) {
			cardBalance-=amount;
			System.out.println("Credit card payment done\n");
		}
		else {
			System.out.println("Insufficient balance\n");
		}
	}
		
}
package functionalInterface.DefiningandImplementingInterfaces.DigitalPayment;

public class Main {
	public static void main(String[] args) {
		
		UPI app = new UPI("73878@ybl", 5000);
		app.pay(2000);
		
		CreditCard card = new CreditCard("Visa", 10000);
		card.pay(5000);
		
		Wallet vault = new Wallet("amazon", 500);
		vault.pay(600);
	}
}
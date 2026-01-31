package functionalInterface.defaultinterfacemethod.paymentgateway;

public class CardPaymentProcessor implements PaymentProcessor{

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Card payment processed");
	}

}

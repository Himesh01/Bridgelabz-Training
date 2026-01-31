package functionalInterface.defaultinterfacemethod.paymentgateway;

public class UpiPaymentProcessor implements PaymentProcessor{
	@Override
    public void processPayment(double amount) {
        System.out.println("UPI payment processed: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("UPI refund processed instantly: " + amount);
    }
}

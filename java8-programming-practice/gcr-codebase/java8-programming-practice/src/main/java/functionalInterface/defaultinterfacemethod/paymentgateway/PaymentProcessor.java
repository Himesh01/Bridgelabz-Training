package functionalInterface.defaultinterfacemethod.paymentgateway;

public interface PaymentProcessor {
	
	void processPayment(double amount);

    default void refund(double amount) {
        System.out.println("🔄 Default refund processed for amount: " + amount);
	}
}

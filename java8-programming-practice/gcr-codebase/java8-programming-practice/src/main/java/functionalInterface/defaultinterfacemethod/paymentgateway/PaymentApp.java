package functionalInterface.defaultinterfacemethod.paymentgateway;

public class PaymentApp {

    public static void main(String[] args) {

        PaymentProcessor card = new CardPaymentProcessor();
        PaymentProcessor upi = new UpiPaymentProcessor();

        card.processPayment(1000);
        card.refund(200);

        upi.processPayment(1500);
        upi.refund(300);
    }
}

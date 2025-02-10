package BridgePattern.PaymentControl.payment;

public class PayPal implements PaymentMethod {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " using PayPal.");
    }

}

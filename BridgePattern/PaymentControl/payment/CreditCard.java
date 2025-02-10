package BridgePattern.PaymentControl.payment;

public class CreditCard implements PaymentMethod {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " using Credit Card.");
    }

}

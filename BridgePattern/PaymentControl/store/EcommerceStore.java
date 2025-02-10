package BridgePattern.PaymentControl.store;

import BridgePattern.PaymentControl.payment.PaymentMethod;

public class EcommerceStore extends Store {

    public EcommerceStore(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    public void checkout(double amount) {
        System.out.println("Checkout in Ecommerce Store with the amount of $" + amount);
        paymentMethod.processPayment(amount);
    }

}

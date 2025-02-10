package BridgePattern.PaymentControl.store;

import BridgePattern.PaymentControl.payment.PaymentMethod;

public class MarketplaceStore extends Store {

    public MarketplaceStore(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    public void checkout(double amount) {
        System.out.println("Checkout in Marketplace Store with the amount of $" + amount);
        paymentMethod.processPayment(amount);
    }

}

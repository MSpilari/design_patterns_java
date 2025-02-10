package BridgePattern.PaymentControl.store;

import BridgePattern.PaymentControl.payment.PaymentMethod;

public abstract class Store {

    protected PaymentMethod paymentMethod;

    public Store(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public abstract void checkout(double amount);

    public void changePaymentMethod(PaymentMethod newPaymentMethod) {
        this.paymentMethod = newPaymentMethod;
        System.out.println("Payment method updated.");
    }

}

package PaymentSystem.Strategies;

import PaymentSystem.PaymentStrategy;

public class PayPal implements PaymentStrategy {

    @Override
    public double pay(double amount) {
        return amount;
    }

}

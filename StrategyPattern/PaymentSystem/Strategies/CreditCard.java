package PaymentSystem.Strategies;

import PaymentSystem.PaymentStrategy;

public class CreditCard implements PaymentStrategy {

    @Override
    public double pay(double amount) {
        return amount;
    }

}

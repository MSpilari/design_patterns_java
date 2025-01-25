package PaymentSystem.Strategies;

import PaymentSystem.PaymentStrategy;

public class Money implements PaymentStrategy {

    @Override
    public double pay(double amount) {
        return amount;
    }

}

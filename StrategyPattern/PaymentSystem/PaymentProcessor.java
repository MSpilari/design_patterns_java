package PaymentSystem;

import java.util.Map;

import PaymentSystem.Strategies.CreditCard;
import PaymentSystem.Strategies.Money;
import PaymentSystem.Strategies.PayPal;

public class PaymentProcessor {

    private final double amount;
    private final String type;
    private final Map<String, PaymentStrategy> mapStrategies = Map.of("money", new Money(), "paypal", new PayPal(),
            "creditcard", new CreditCard());

    public PaymentProcessor(double amount, String type) {
        this.amount = amount;
        this.type = type;
    }

    public void totalCost() {
        PaymentStrategy strategy = mapStrategies.get(type);
        if (strategy == null) {
            System.out.println("The " + type + " method of payment isn't allowed.");
            return;
        }
        double result = mapStrategies.get(type).pay(amount);

        System.out.println("Paid " + result + " using " + type + ".");
    }
}

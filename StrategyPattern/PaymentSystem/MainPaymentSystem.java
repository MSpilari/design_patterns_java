package PaymentSystem;

public class MainPaymentSystem {
    public static void main(String[] args) {
        PaymentProcessor moneyPaid = new PaymentProcessor(250, "money");
        PaymentProcessor creditCardPaid = new PaymentProcessor(300, "creditcard");
        PaymentProcessor payPalPaid = new PaymentProcessor(350, "paypal");
        PaymentProcessor invalidPaid = new PaymentProcessor(400, "invalid");

        moneyPaid.totalCost();
        creditCardPaid.totalCost();
        payPalPaid.totalCost();
        invalidPaid.totalCost();
    }
}

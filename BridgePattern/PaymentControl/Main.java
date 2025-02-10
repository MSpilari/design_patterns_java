package BridgePattern.PaymentControl;

import BridgePattern.PaymentControl.payment.CreditCard;
import BridgePattern.PaymentControl.payment.PayPal;
import BridgePattern.PaymentControl.store.EcommerceStore;
import BridgePattern.PaymentControl.store.MarketplaceStore;
import BridgePattern.PaymentControl.store.Store;

public class Main {
    public static void main(String[] args) {

        Store ecommerce = new EcommerceStore(new CreditCard());
        ecommerce.checkout(150.00);

        System.out.println("\n----------------------\n");

        Store marketplace = new MarketplaceStore(new PayPal());
        marketplace.checkout(250.00);

        System.out.println("\n----------------------\n");

        ecommerce.changePaymentMethod(new PayPal());
        ecommerce.checkout(99.90);
    }
}

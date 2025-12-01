package Factory;

import Strategy.CreditCardPayment;
import Strategy.NetBankingPayment;
import Strategy.PaymentStrategy;
import Strategy.UPIPayment;

public class PaymentFactory {
    public PaymentStrategy createInstance(String instance) {
        switch (instance) {
            case "upi":
                return new UPIPayment();
            
            case "netbanking":
                return new NetBankingPayment();

            case "creditcard":
                return new CreditCardPayment();
        
            default:
                return null;
        }
    }
}

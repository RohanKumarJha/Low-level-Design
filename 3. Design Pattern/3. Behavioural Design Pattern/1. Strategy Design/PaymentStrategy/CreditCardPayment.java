package PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of "+amount+" through creditCard");
    }
    
}


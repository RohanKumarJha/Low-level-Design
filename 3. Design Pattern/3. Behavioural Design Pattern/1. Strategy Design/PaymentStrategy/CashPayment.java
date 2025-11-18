package PaymentStrategy;

public class CashPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of "+amount+" through cash");
    }
    
}

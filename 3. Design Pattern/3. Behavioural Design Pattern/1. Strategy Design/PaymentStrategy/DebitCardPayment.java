package PaymentStrategy;

public class DebitCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of "+amount+" through debitCard");
    }
    
}

package Strategy_Design;

public class DebitCardPayment implements PaymentStrategy {
    
    @Override
    public void pay(double amount) {
        System.out.println("Payment of "+amount+" rs. through debitCard");
    }

}

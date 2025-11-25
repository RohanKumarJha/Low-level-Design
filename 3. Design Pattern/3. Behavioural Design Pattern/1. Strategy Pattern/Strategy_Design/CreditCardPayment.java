package Strategy_Design;

public class CreditCardPayment implements PaymentStrategy {
    
    @Override
    public void pay(double amount) {
        System.out.println("Payment of "+amount+" rs. through creditCard");
    }

}

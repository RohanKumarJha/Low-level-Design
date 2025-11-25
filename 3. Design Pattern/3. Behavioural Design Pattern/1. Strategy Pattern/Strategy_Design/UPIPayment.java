package Strategy_Design;

public class UPIPayment implements PaymentStrategy {
    
    @Override
    public void pay(double amount) {
        System.out.println("Payment of "+amount+" rs. through upi");
    }

}

package Strategy;

public class UPIPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Pay amount of rupees "+amount+" through upi");
    }
    
}

package Payment;

public class Upi implements Payment {
    
    @Override
    public void pay(double amount) {
        System.out.println("Payment of amount "+ amount +" through upi");
    }
}

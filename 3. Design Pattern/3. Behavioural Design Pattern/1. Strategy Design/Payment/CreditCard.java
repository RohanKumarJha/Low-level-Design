package Payment;

public class CreditCard implements Payment {
    
    @Override
    public void pay(double amount) {
        System.out.println("Payment of amount "+ amount +" through creditcard");
    }

}

package Payment;

public class Cash implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of amount "+ amount +" through cash");
    }
}

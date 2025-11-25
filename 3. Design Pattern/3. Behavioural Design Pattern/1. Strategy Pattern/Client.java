import Strategy_Design.CreditCardPayment;
import Strategy_Design.DebitCardPayment;
import Strategy_Design.PaymentStrategy;
import Strategy_Design.UPIPayment;

public class Client {
    public static void main(String[] args) {
        PaymentStrategy paymentStrategy1 = new CreditCardPayment();
        paymentStrategy1.pay(1200);

        PaymentStrategy paymentStrategy2 = new DebitCardPayment();
        paymentStrategy2.pay(1200);

        PaymentStrategy paymentStrategy3 = new UPIPayment();
        paymentStrategy3.pay(1200);
    }
}

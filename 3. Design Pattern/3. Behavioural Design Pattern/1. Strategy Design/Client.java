import PaymentStrategy.CashPayment;
import PaymentStrategy.CreditCardPayment;
import PaymentStrategy.DebitCardPayment;
import PaymentStrategy.PaymentStrategy;

public class Client {
    public static void main(String[] args) {
        PaymentStrategy payment1 = new CashPayment();
        payment1.pay(2500);

        PaymentStrategy payment2 = new DebitCardPayment();
        payment2.pay(1700);

        PaymentStrategy payment3 = new CreditCardPayment();
        payment3.pay(4300);
    }
}

import PaymentWays.CardPayment;
import PaymentWays.Rozarpay;
import PaymentWays.UpiPayment;

public class Client {
    public static void main(String[] args) {
        PaymentStrategy payment1 = new PaymentStrategy(new CardPayment());
        payment1.pay(1000.0);

        PaymentStrategy payment2 = new PaymentStrategy(new UpiPayment());
        payment2.pay(2500.0);

        PaymentStrategy payment3 = new PaymentStrategy(new Rozarpay());
        payment3.pay(4300.0);
    }
}

package PaymentWays;

public class CardPayment implements PaymentInterface {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of amount " + amount + " is successfully done by Card.");
    }
}


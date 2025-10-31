package PaymentWays;

public class Rozarpay implements PaymentInterface {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of amount " + amount + " is successfully done by Rozarpay.");
    }
}


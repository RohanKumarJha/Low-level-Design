package PaymentWays;

public class UpiPayment implements PaymentInterface {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of amount " + amount + " is successfully done by UPI.");
    }
}


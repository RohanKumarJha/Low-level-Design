import PaymentWays.PaymentInterface;

public class PaymentStrategy {
    private PaymentInterface paymentInterface;

    public PaymentStrategy(PaymentInterface paymentInterface) {
        this.paymentInterface = paymentInterface;
    }

    public void pay(double amount) {
        paymentInterface.pay(amount);
    }
}

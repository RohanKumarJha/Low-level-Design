package strategies;
import model.Order;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(Order order) {
        System.out.println("Paid ₹" + order.getTotal() + " using Credit Card.");
    }
}


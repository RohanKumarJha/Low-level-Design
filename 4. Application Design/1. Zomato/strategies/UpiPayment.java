package strategies;
import model.Order;

public class UpiPayment implements PaymentStrategy {
    @Override
    public void pay(Order order) {
        System.out.println("Paid ₹" + order.getTotal() + " via UPI.");
    }
}

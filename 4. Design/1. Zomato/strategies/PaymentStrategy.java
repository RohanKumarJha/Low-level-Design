package strategies;
import model.Order;

public interface PaymentStrategy {
    void pay(Order order);
}

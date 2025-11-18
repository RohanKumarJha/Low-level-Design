package strategies;

import model.Order;

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(Order order) {
        System.out.println("Paid ₹" + order.getTotal() + " by Cash on Delivery.");
    }
}

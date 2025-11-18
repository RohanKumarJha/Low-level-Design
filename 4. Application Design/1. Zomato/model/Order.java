package model;
import strategies.PaymentStrategy;

public class Order {
    private static int counter = 1;
    private int id;
    private Customer customer;
    private Restaurant restaurant;
    private double total;
    private String status;
    private PaymentStrategy paymentStrategy;

    public Order(Customer customer, Restaurant restaurant, double total) {
        this.id = counter++;
        this.customer = customer;
        this.restaurant = restaurant;
        this.total = total;
        this.status = "CREATED";
    }

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void pay() {
        if (paymentStrategy != null) {
            paymentStrategy.pay(this);
            status = "PAID";
        }
    }

    public int getId() { return id; }
    public double getTotal() { return total; }
    public String getStatus() { return status; }
    public Customer getCustomer() { return customer; }
}

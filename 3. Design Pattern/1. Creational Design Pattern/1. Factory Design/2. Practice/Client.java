import Factory.PaymentFactory;

public class Client {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory(); 
        paymentFactory.createInstance("netbanking").pay(1200);
        paymentFactory.createInstance("upi").pay(2200);
        paymentFactory.createInstance("creditcard").pay(3100);
    }
}
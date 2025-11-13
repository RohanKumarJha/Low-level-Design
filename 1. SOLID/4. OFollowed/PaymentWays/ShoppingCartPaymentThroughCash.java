package PaymentWays;

public class ShoppingCartPaymentThroughCash implements ShoppingCartPayment {

    @Override
    public void payThrough(double price) {
        System.out.println("Payment of "+price+" through cash");
    }
    
}

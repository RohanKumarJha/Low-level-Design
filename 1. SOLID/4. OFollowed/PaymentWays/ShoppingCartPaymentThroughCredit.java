package PaymentWays;

public class ShoppingCartPaymentThroughCredit implements ShoppingCartPayment {

    @Override
    public void payThrough(double price) {
        System.out.println("Payment of "+price+" through credit card");
    }
    
}
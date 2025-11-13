package PaymentWays;

public class ShoppingCartPaymentThroughDebit implements ShoppingCartPayment {

    @Override
    public void payThrough(double price) {
        System.out.println("Payment of "+price+" through debit card");
    }
    
}

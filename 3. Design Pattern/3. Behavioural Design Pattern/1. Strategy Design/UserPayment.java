import Payment.Cash;
import Payment.CreditCard;
import Payment.Payment;
import Payment.Upi;

public class UserPayment {
    public static void main(String[] args) {
        Payment pay1 = new Cash();
        pay1.pay(1000.0);

        Payment pay2 = new CreditCard();
        pay2.pay(2500.0);

        Payment pay3 = new Upi();
        pay3.pay(5200.0);
    }
}

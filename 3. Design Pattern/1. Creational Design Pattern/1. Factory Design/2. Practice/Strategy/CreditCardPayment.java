package Strategy;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Pay amount of rupees "+amount+" through creditCard");
    }

}

package Strategy;

public class NetBankingPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Pay amount of rupees "+amount+" through netbanking");
    }

}

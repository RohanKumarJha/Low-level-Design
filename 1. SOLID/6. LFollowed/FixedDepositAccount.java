public class FixedDepositAccount implements Account {

    double balance = NormalAccount.balance;

    @Override
    public void credit(double amount) {
        System.out.println("Amount successfully credit from your fixedDepositAccount, now balance is "+(balance+amount));
        balance += amount;
    }
    
}

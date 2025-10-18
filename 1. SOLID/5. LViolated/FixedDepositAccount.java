public class FixedDepositAccount implements Account {

    double balance = Account.balance;

    @Override
    public void debit(double amount) {
        System.out.println("Exception occurs!!!");
    }

    @Override
    public void credit(double amount) {
        System.out.println("Amount successfully credit from your savingAccount, now balance is "+(balance+amount));
        balance += amount;
    }
    
}

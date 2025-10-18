public class Client {
    public static void main(String[] args) {
        Account account1 = new FixedDepositAccount();
        NormalAccount account2 = new CurrentAccount();
        NormalAccount account3 = new SavingAccount();
        account1.credit(2000);
        account2.credit(1000);
        account3.credit(1000);
        account3.debit(5000);
    }
}
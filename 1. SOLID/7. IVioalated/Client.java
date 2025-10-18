public class Client {
    public static void main(String[] args) {
        Account account1 = new CurrentAccount();
        Account account2 = new SavingAccount();
        account1.credit(1000);
        account1.debit(2000);
        account2.credit(500);
        account2.debit(2000);
        Account account3 = new FixedDepositAccount();
        account3.debit(1000);
    }
}
public class SavingAccount implements Account {

    double balance = Account.balance;

    @Override
    public void debit(double amount) {
        if(amount > balance) {
            System.out.println("Insufficient Balance in your savingAccount");
        } else {
            System.out.println("Amount successfully debited from your savingAccount, now balance is "+(balance-amount));
            balance -= amount;
        }
    }

    @Override
    public void credit(double amount) {
        System.out.println("Amount successfully credit from your savingAccount, now balance is "+(balance+amount));
        balance += amount;
    }
    
}

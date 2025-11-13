public class SavingBank implements Bank {

    private double balance = 1000;

    @Override
    public void debit(double amount) {
        balance += amount;
        System.out.println(amount+" ruppees added in your saving account successfully...");
    }

    @Override
    public void credit(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println(amount+" ruppees added in your saving account successfully...");
        } else {
            System.out.println("Insufficient balance");
        }
    }
    
}

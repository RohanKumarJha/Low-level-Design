public class FixedDepositAccount implements Bank {

    private double balance = 1000;

    @Override
    public void debit(double amount) throws NoSuchMethodException {
        throw new NoSuchMethodException("Method doesn't exist");
    }

    @Override
    public void credit(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println(amount+" ruppees added in your account successfully...");
        } else {
            System.out.println("Insufficient balance");
        }
    }
    
}
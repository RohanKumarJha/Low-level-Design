public class Client {
    public static void main(String[] args) {
        try {
            Bank bank1 = new CurrentAccount();
            bank1.debit(2500);

            Bank bank2 = new SavingBank();
            bank2.debit(2200);

            Bank bank3 = new FixedDepositAccount();
            bank3.debit(200);
        } catch(NoSuchMethodException e) {
            System.out.println(e.getMessage());
        }
    
    }
}

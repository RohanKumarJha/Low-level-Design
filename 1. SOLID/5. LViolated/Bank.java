public interface Bank {
    void debit(double amount) throws NoSuchMethodException;
    void credit(double amount);
}
public interface Account {
    double balance = 1000;
    void debit(double amount);
    void credit(double amount);
}

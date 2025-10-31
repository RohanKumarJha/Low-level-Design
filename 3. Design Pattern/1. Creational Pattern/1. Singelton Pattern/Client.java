public class Client {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.createConnection();
        DatabaseConnection db2 = DatabaseConnection.createConnection();

        db1.query("SELECT * FROM users");
        db2.query("DELETE FROM orders WHERE id=10");
        
        System.out.println(db1 == db2);
    }
}
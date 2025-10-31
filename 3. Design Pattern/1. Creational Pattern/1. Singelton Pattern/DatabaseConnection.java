public class DatabaseConnection {

    static DatabaseConnection databaseConnection;

    private DatabaseConnection() {
        System.out.println("Connection created");
    }

    public static DatabaseConnection createConnection() {
        if(databaseConnection == null) {
            databaseConnection = new DatabaseConnection();
        }
        return databaseConnection;
    }

    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}

import Database.CreateDatabase;

public class ClientInstance {
    public static void main(String[] args) {
        CreateDatabase db1 = CreateDatabase.createDb();
        System.out.println(db1.toString());

        CreateDatabase db2 = CreateDatabase.createDb();
        System.out.println(db2.toString());

        System.out.println(db1.equals(db2));
    }
}

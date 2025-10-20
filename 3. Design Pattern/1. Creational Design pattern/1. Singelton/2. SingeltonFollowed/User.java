public class User {
    public static void main(String[] args) {
        Database db1 = Database.createObject();
        System.out.println(db1.hashCode());

        Database db2 = Database.createObject();
        System.out.println(db2.hashCode());

        Database db3 = Database.createObject();
        System.out.println(db3.hashCode());
    }
}
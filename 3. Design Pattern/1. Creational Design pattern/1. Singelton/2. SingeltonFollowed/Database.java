public class Database {

    private static Database database = null;

    private Database() {}

    public static Database createObject() {
        if(database == null) {
            database = new Database();
        } return database;
    }
}
package Database;

public class CreateDatabase {

    private static CreateDatabase createDatabase;

    private CreateDatabase() {
        System.out.println("Create instance");
    }

    public static CreateDatabase createDb() {
        if(createDatabase == null) {
            createDatabase = new CreateDatabase();
        } return createDatabase;
    }
}
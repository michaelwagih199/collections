package unitTesting.mockito;

public class Service {
    private final Database database;

    public Service(Database database) {
        this.database = database;
    }
    public boolean query(String s){
        return database.isAvailable();
    }

    @Override
    public String toString() {
        return "Using database with id: " + String.valueOf(database.getId());
    }
}

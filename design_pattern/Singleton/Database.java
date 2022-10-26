package Singleton;

public class Database {
    private static Database connection;

    private Database() {
        System.out.println("private constructor called");
    }

    public static Database getInstance() {
        if (connection == null) {
            connection = new Database();
        }
        System.out.println("return instance");
        return connection;
    }
}

package Singleton;
public class Singleton {
    public static void main(String[] args) {
        Database db = Database.getInstance();
        System.out.println(db);

        System.out.println("----");
        Database db2 = Database.getInstance();
        System.out.println(db2);
    }
}

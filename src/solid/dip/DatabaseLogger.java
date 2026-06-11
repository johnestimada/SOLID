package solid.dip;

public class DatabaseLogger implements Logger {
    public void log(String message) {
        System.out.println("Database: " + message);
    }
}
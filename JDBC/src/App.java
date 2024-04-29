import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/users";

        try (Connection connection = DriverManager.getConnection(url)) {
            System.out.println("Connection to MySQL successful!");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
import java.sql.*;

public class App {
    public static void main(String[] args) {
        Connection conn = null;
        String url = "jdbc:mysql://localhost/users?useSSL=false";
        String username = "root";
        String password = "";
        try {
            // Establish connection
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to MySQL...");
        } catch (SQLException e) {
            System.out.println("Error connecting to MySQL: " + e.getMessage());
        } finally {
            // Close the connection
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Connection closed...");
                } catch (SQLException e) {
                    System.out.println("Error closing connection: " + e.getMessage());
                }
            }
        }
    }
}

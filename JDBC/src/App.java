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

            // Create a table named 'users'
            String createTableSQL = "CREATE TABLE IF NOT EXISTS users (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "username VARCHAR(50) NOT NULL," +
                    "email VARCHAR(100) NOT NULL" +
                    ")";
            try (Statement statement = conn.createStatement()) {
                statement.execute(createTableSQL);
                System.out.println("Table 'users' created successfully...");

                // Insert some sample data into the 'users' table
                String insertDataSQL = "INSERT INTO users (username, email) VALUES " +
                        "('john_doe', 'john@example.com')," +
                        "('jane_doe', 'jane@example.com')," +
                        "('alice', 'alice@example.com')";
                int rowsAffected = statement.executeUpdate(insertDataSQL);
                System.out.println(rowsAffected + " row(s) inserted into 'users' table...");

            } catch (SQLException e) {
                System.out.println("Error executing SQL statement: " + e.getMessage());
            }
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

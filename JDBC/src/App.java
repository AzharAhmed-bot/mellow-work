import java.sql.*;

public class App {
    public static void main(String[] args) {
        Connection conn = null;
        String url = "jdbc:mysql://localhost/users";
        String username = "root";
        String password = "";

        try {
            // Establish connection
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to MySQL...");

            // Prepare SQL statement for retrieval
            String selectSQL = "SELECT * FROM users";
            PreparedStatement preparedStatement = conn.prepareStatement(selectSQL);
            ResultSet resultSet = preparedStatement.executeQuery();

            // Print the results
            while (resultSet.next()) {
                String name = resultSet.getString("username");
                String email = resultSet.getString("email");
                System.out.println("Username: " + name + ", Email: " + email);
            }

        } catch (SQLException e) {
            System.out.println("Error executing SQL: " + e.getMessage());
        } finally {
            // Close the connection
            if (conn!= null) {
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
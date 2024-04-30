import java.sql.*;

public class App {
    public static void main(String[] args) {
        Connection conn = null;
        String url = "jdbc:mysql://localhost/?useSSL=false";
        String username="root";
        String password="";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Xampp Mysql connected...");
        } catch(Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}

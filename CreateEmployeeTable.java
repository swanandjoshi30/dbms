import java.sql.*;

public class CreateEmployeeTable {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            // Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "username", "password");

            // Create a statement object
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            // Execute SQL query to create employee table
            String sql = "CREATE TABLE employee " +
                         "(product_id INT PRIMARY KEY, " +
                         "product_name VARCHAR(255))";
            stmt.executeUpdate(sql);

            System.out.println("Employee table created successfully!");
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            } // nothing we can do
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}

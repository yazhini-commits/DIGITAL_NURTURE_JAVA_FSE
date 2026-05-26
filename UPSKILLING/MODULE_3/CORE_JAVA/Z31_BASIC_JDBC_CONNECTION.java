package UPSKILLING.MODULE_3.CORE_JAVA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Z31_BASIC_JDBC_CONNECTION {
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            try (Connection conn = DriverManager.getConnection("jdbc:sqlite::memory:"); Statement stmt = conn.createStatement()) {
                stmt.executeUpdate("CREATE TABLE IF NOT EXISTS students(id INTEGER PRIMARY KEY, name TEXT)");
                stmt.executeUpdate("INSERT INTO students(name) VALUES('Alice')");
                ResultSet rs = stmt.executeQuery("SELECT id, name FROM students");
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + ": " + rs.getString("name"));
                }
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("JDBC driver not found: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Database error: " + ex.getMessage());
        }
    }
}

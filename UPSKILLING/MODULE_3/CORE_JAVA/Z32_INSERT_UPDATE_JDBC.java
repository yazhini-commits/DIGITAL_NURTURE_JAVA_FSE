package UPSKILLING.MODULE_3.CORE_JAVA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Z32_INSERT_UPDATE_JDBC {
    static class StudentDAO {
        private final Connection connection;

        StudentDAO(Connection connection) {
            this.connection = connection;
        }

        void createTable() throws SQLException {
            try (PreparedStatement stmt = connection.prepareStatement(
                    "CREATE TABLE IF NOT EXISTS students(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, grade TEXT)")) {
                stmt.executeUpdate();
            }
        }

        void insertStudent(String name, String grade) throws SQLException {
            try (PreparedStatement stmt = connection.prepareStatement(
                    "INSERT INTO students(name, grade) VALUES(?, ?)")) {
                stmt.setString(1, name);
                stmt.setString(2, grade);
                stmt.executeUpdate();
            }
        }

        void updateGrade(int id, String grade) throws SQLException {
            try (PreparedStatement stmt = connection.prepareStatement(
                    "UPDATE students SET grade = ? WHERE id = ?")) {
                stmt.setString(1, grade);
                stmt.setInt(2, id);
                stmt.executeUpdate();
            }
        }
    }

    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            try (Connection conn = DriverManager.getConnection("jdbc:sqlite::memory:")) {
                StudentDAO dao = new StudentDAO(conn);
                dao.createTable();
                dao.insertStudent("Alice", "A");
                dao.updateGrade(1, "B");
                System.out.println("Insert and update operations executed.");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("JDBC driver not found: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Database error: " + ex.getMessage());
        }
    }
}

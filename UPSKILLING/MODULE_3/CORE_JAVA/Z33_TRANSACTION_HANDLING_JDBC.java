package UPSKILLING.MODULE_3.CORE_JAVA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Z33_TRANSACTION_HANDLING_JDBC {
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            try (Connection conn = DriverManager.getConnection("jdbc:sqlite::memory:")) {
                try (Statement stmt = conn.createStatement()) {
                    stmt.executeUpdate("CREATE TABLE IF NOT EXISTS accounts(id INTEGER PRIMARY KEY, balance INTEGER)");
                    stmt.executeUpdate("INSERT INTO accounts(id, balance) VALUES(1, 1000), (2, 500)");
                }
                conn.setAutoCommit(false);
                try (PreparedStatement debit = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
                     PreparedStatement credit = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?")) {
                    debit.setInt(1, 200);
                    debit.setInt(2, 1);
                    debit.executeUpdate();

                    credit.setInt(1, 200);
                    credit.setInt(2, 2);
                    credit.executeUpdate();
                    conn.commit();
                    System.out.println("Transaction committed successfully.");
                } catch (SQLException ex) {
                    conn.rollback();
                    System.out.println("Transaction rolled back: " + ex.getMessage());
                }
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("JDBC driver not found: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Database error: " + ex.getMessage());
        }
    }
}

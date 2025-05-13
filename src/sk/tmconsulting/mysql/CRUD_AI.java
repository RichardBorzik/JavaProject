package sk.tmconsulting.mysql;

import java.sql.*;

public class CRUD_AI {

    private static final String URL = "jdbc:mysql://localhost:3306/test_db";
    private static final String USER = "root";
    private static final String PASSWORD = "li3TJ7zu";

    // Metóda na pripojenie k databáze
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Create - Vytvorenie novej knihy
    public static void createBook(String name, int pages) {
        String query = "INSERT INTO book (name, pages) VALUES (?, ?)";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setInt(2, pages);
            stmt.executeUpdate();
            System.out.println("Book created successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Read - Načítanie knihy podľa ID
    public static void readBook(int id) {
        String query = "SELECT * FROM book WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Pages: " + rs.getInt("pages"));
            } else {
                System.out.println("Book not found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update - Aktualizácia knihy
    public static void updateBook(int id, String name, int pages) {
        String query = "UPDATE book SET name = ?, pages = ? WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setInt(2, pages);
            stmt.setInt(3, id);
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Book updated successfully!");
            } else {
                System.out.println("Book not found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete - Vymazanie knihy
    public static void deleteBook(int id) {
        String query = "DELETE FROM book WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Book deleted successfully!");
            } else {
                System.out.println("Book not found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Testovanie CRUD operácií
        createBook("Java Programming", 450);
        //readBook(1);
        //updateBook(1, "Advanced Java Programming", 500);
        //deleteBook(1);
    }
}


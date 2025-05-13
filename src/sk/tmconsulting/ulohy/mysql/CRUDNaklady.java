package sk.tmconsulting.ulohy.mysql;

import java.sql.*;

// zobraz vsetky zaznamy z tabulky naklady
// vlozit novy zaznam prostrednictvom konzoly

public class CRUDNaklady {

    private static final String URL = "jdbc:mysql://localhost:3306/sprava_nakladov_db";
    private static final String USER = "root";
    private static final String PASSWORD = "li3TJ7zu";

    // Metóda na pripojenie k databáze
    public static Connection getConnection () throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
    public static void vlozNaklad(String nazov, double cena, String kategoria){
        String query = "INSERT INTO naklady (nazov, cena, kategoria) VALUES (?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, nazov);
            stmt.setDouble(2, cena);
            stmt.setString(3, kategoria);
            stmt.executeUpdate();
            System.out.println("Ďalší náklad bol úspešne vytvorený!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void zobrazVsetkyNaklady () {
        String query = "SELECT * FROM naklady";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print("\tNázov: " + rs.getString("nazov"));
                System.out.print("\tDátum: " + rs.getTimestamp("datum"));
                System.out.print("\tCena: " + rs.getDouble("cena"));
                System.out.println("\tKategória: " + rs.getString("kategoria"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main (String[]args){
        vlozNaklad("Bicylel", 199.80, "Iné");
        zobrazVsetkyNaklady();
    }
}
package sk.tmconsulting.ulohy.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UlohyNaQueries {

    private static final String URL = "jdbc:mysql://localhost:3306/sprava_nakladov_2tabulky_db"; // uprav si
    private static final String USERNAME = "root";
    private static final String PASSWORD = "li3TJ7zu";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    // 1) Sčítaj celkové náklady v tabuľke expenses
    public double getTotalExpenses() {
        String sql = "SELECT SUM(amount) FROM expenses";

        // Uskutocnenie pripojenia na databazu a vykonanie samotneho query (ktory je ulozeny v premennej sql)
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            // Ak existuje vysledok (cize aspon 1 zaznam) tak pokracuj vo vyberete dat ...
            if (resultSet.next()) {
                return resultSet.getDouble(1); // Cislo 1 reprezentuje poradie stlpca (pola) tabulky podla query, resp. tej casti, ktora nasleduje za SELECT. Mozeme sa odkazovat aj na nazov, napr. return resultSet.getDouble("SUM(amount)") bude tiez akceptovatelne alebo resultSet.getDouble("sum_amount") ak by query vyzeral nasledovne: String sql = "SELECT SUM(amount) AS sum_amount FROM expenses";
            } else {
                return 0.0; // ... ak nie, tak vrati 0.0
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return 0.0;
        }
    }

    // 2) Sčítaj celkové náklady podľa jednotlivých kategórií  v tabuľke expenses
    public Map<String, Double> getExpensesByCategory() {
        String sql = "SELECT category, SUM(amount) FROM expenses GROUP BY category";
        Map<String, Double> categorySums = new HashMap<>();

        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                String category = resultSet.getString(1); // Mozeme nahradit aj resultSet.getString("category");
                double sum = resultSet.getDouble(2); // Mozeme nahradit aj resultSet.getString("SUM(amount)"); alebo aj resultSet.getString("sucet_spolu"); ak by query vyzeral takto: sql = "SELECT category, SUM(amount) AS sucet_spolu FROM expenses GROUP BY category";
                categorySums.put(category, sum);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return categorySums;
    }

    // 4. Vypíš všetky náklady spolu s menami jednotlivých členov za celé obdobie zoradených abecedne
    public List<User> usersWithExpenses() {
        String sql = """
                SELECT users.name, expenses.category, expenses.amount, expenses.expense_date 
                FROM users 
                INNER JOIN expenses ON users.id = expenses.user_id
                """;
        List<User> users = new ArrayList<>(); // Dynamicke pole = ArrayList je na zaciatku prazdny, tu sme ho vytvorili

        // Konekcia na databazu a vykonanie query (ktory je ulozeny v premennej sql)
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) { // Prechadzame jednotlivymi zaznamami
                User user = new User(); // Vytvorime prazdneho pouzivatela, ktoreho ...
                user.setName(resultSet.getString("name"));
                user.setCategory(resultSet.getString("category"));
                user.setAmount(resultSet.getDouble("amount"));
                user.setExpenseDate(resultSet.getDate("expense_date"));
                users.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    // 7.	Zobraz členov a ich náklady, ktorí sa narodili v 80-tych rokoch
    public List<User> userIn80sExpenses() {
        String sql = """
                SELECT * FROM users INNER JOIN expenses ON users.id = expenses.user_id WHERE users.birth_date BETWEEN '1980-01-01' AND '1989-12-31'
                """;
        List<User> users = new ArrayList<>(); // Dynamicke pole = ArrayList je na zaciatku prazdny, tu sme ho vytvorili

        // Konekcia na databazu a vykonanie query (ktory je ulozeny v premennej sql)
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) { // Prechadzame jednotlivymi zaznamami
                User user = new User(); // Vytvorime prazdneho pouzivatela, ktoreho ...
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setRelation(resultSet.getString("relation"));
                user.setBirthDate(resultSet.getDate("birth_date"));
                users.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    // 10)	Vyhľadaj všetkých členov podľa priezviska začínajúcich na Ž, resp. bezohľadu na diakritiku ak v stĺpci name je meno a priezvisko spolu (sú však oddelené medzerou)
    public List<User> findUsersWithZInName(char character) {
        String sql = "SELECT * FROM users WHERE SUBSTRING_INDEX(name, ' ', -1) LIKE '" + character + "%'";
        List<User> users = new ArrayList<>(); // Dynamicke pole = ArrayList je na zaciatku prazdny, tu sme ho vytvorili

        // Konekcia na databazu a vykonanie query (ktory je ulozeny v premennej sql)
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) { // Prechadzame jednotlivymi zaznamami
                User user = new User(); // Vytvorime prazdneho pouzivatela, ktoreho ...
                user.setId(resultSet.getInt("id")); // ... naplnime id
                user.setName(resultSet.getString("name")); // name
                user.setRelation(resultSet.getString("relation"));
                user.setBirthDate(resultSet.getDate("birth_date"));
                users.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    public static void main(String[] args) {
        UlohyNaQueries repository = new UlohyNaQueries();

        // 1. Sčítaj celkové náklady v tabuľke expenses
        double total = repository.getTotalExpenses();
        System.out.println("Total Expenses: " + total);
        System.out.println();

        // 2. Sčítaj celkové náklady podľa jednotlivých kategórií v tabuľke expenses
        Map<String, Double> expensesByCategory = repository.getExpensesByCategory();

        // Print keys and values, STARY ZAPIS
        /*for (String category : expensesByCategory.keySet()) {
            System.out.println("Category: " + category + " Sum: " + expensesByCategory.get(category));
        }*/

        // Print keys and values, NOVY ZAPIS cez lambda výrazy
        expensesByCategory.forEach((category, sum) ->
                System.out.println("Category: " + category + ", Sum: " + sum));

        // 4.
        List<User> usersWithExpenses = repository.usersWithExpenses();
        System.out.println("\nUsers with expenses: \n");
        for(User user : usersWithExpenses)
            System.out.printf(
               "User: %-20s | Category: %-15s | Amount: %8.2f € | Date: %s%n",
                    user.getName(),
                    user.getCategory(),
                    user.getAmount(),
                    user.getExpenseDate()
            );

        // 7. Zobraz členov a ich náklady, ktorí sa narodili v 80-tych rokoch
        List<User> usersBornIn80s = repository.userIn80sExpenses();
        System.out.println("\nUsers born in 80´s: \n");
        for(User user : usersBornIn80s)
            System.out.println(user);

        // 10. Vypise vsetkych pouzivatelov zacinajucich na pismeno...
        List<User> usersWithZ = repository.findUsersWithZInName('Z');
        /*for (User user:usersWithZ) {
            System.out.println(user.getId());
            System.out.println(user.getName());
            System.out.println(user.getRelation());
            System.out.println(user.getBirthDate());
        }*/
        System.out.println("\nUsers with Z in the last name: \n");
        for(User user:usersWithZ)
            System.out.println(user);

    }

}
package com.w3schools.príklady;

// Import the HashMap class
import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println( i + " " + capitalCities.get(i));
        }

        System.out.println("Hlavné mesto Veľkej Británie je: " + capitalCities.get("England"));
    }
}

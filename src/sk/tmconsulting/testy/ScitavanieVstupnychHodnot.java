package sk.tmconsulting.testy;

import java.util.ArrayList;
import java.util.Scanner;

public class ScitavanieVstupnychHodnot {
    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<>();
        Scanner scr = new Scanner(System.in);

        while (true) {

            // Try-catch na kontrolu vstupu

            System.out.println("Zadajte číslo (záporné číslo ukončí program)");
            try {
                double input = Double.parseDouble(scr.nextLine());
                if (input < 0) {
                    break;
                }
                numbers.add(input);

            } catch (NumberFormatException e) {
                System.out.println("Prosím zadajte platné číslo");
            }
        }
        System.out.println("Zadané čisla sú:" + numbers);

        // Zaokruhlovanie

        double add = 0;
        for (double number : numbers) {
            add += number;
        }
        double roundedSum = roundToTwoDecimalPlaces(add);
        System.out.printf("Zaokrúhlený súčet: %.2f%n", roundedSum);
    }

    public static double roundToTwoDecimalPlaces(double number) {
        return Math.round(number * 100.0) / 100.0;
    }
}


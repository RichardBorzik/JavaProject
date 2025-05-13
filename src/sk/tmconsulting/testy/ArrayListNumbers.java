package sk.tmconsulting.testy;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNumbers {
    ArrayList<Double> numbers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("Zadajte číslo (záporné číslo ukončí program)");

            // Try-catch na kontrolu vstupu
            try {
                double input = Double.parseDouble(scanner.nextLine());
                if (input < 0) {
                    break;
                }
                numbers.add(input);
            } catch (NumberFormatException e) {
                System.out.println("Prosím zadajte platné číslo.");
            }
        }
        System.out.println("Zadané čisla sú:" + numbers);

        // Volanie metody pre sucet a metody, ktora zaokruhli nas sucet
        double sum = calculateSum();
        double roundedSum = roundToTwoDecimalPlaces(sum);

        System.out.printf("Zaokrúhlený súčet: %.2f%n", roundedSum);
    }

    // Metody na sucet a zaokrulovanie
    public double calculateSum(Double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    public double roundToTwoDecimalPlaces(double number) {
        return Math.round(number * 100.0) / 100.0;
    }
}

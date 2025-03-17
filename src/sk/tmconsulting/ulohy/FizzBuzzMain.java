package sk.tmconsulting.ulohy;

import java.util.Scanner;

public class FizzBuzzMain {
    public static void main(String[] args) {

        // fizz delitelne 3, buzz delitelne 5, fizzBuzz 3 aj 5

        Scanner scr = new Scanner(System.in);
        System.out.println("Zadaj číslo: ");
        int cisla = scr.nextInt();

        for (int cislo = 1; cislo <= cisla; cislo++) {

            if (cislo % 3 == 0 && cislo % 5 == 0) {
                System.out.print("FizzBuzz, ");
            } else if (cislo % 3 == 0) {
                System.out.print("Fizz, ");
            } else if (cislo % 5 == 0) {
                System.out.print("Buzz, ");
            } else {
                System.out.print(cislo + ", ");
            }
            scr.close();
        }
    }
}


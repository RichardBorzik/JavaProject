package sk.tmconsulting.ulohy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameGuessNumberMain {
    public static void main(String[] args) {

        int vstup = (int) (Math.random() * 100) + 1;
        Scanner scr = new Scanner(System.in);
        int vstupCislo = 0;

        do {
            System.out.print("Zadaj číslo od 1 do 100: ");

            try {
                vstupCislo = scr.nextInt();
                if (vstup < vstupCislo)
                    System.out.println("Neuhádol si, moje číslo je menšie.");
                else if (vstup > vstupCislo)
                    System.out.println("Neuhádol si, moje číslo je väčšie.");
                else
                    System.out.println("BINGO! Uhádol si!");

            } catch (InputMismatchException e) {
                System.out.println("Chyba! Zadaj prosím celé číslo.");
                scr.nextLine();
            }
        }
        while (vstup != vstupCislo) ;

        scr.close();
    }
}
package sk.tmconsulting.oop.enumexample;

import java.util.Scanner;

public class ZadajZnackuAutaVyhodnotimKvalitu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadaj značku vozidla (Veľkými písmenami)");
        String zadaneVozidlo = scanner.nextLine();

        if (zadaneVozidlo.equals(ZnackaAuta.VW.toString()))
            System.out.println("Kvalita je veľmi dobrá");
        else if (zadaneVozidlo.equals(ZnackaAuta.FORD.toString()))
            System.out.println("Kvalita je veľmi dobrá");
        else if (zadaneVozidlo.equals(ZnackaAuta.HONDA.toString()))
            System.out.println("Vynikajúce");
        else if (zadaneVozidlo.equals(ZnackaAuta.TOYOTA.toString()))
            System.out.println("Kvalita je dobrá");
        else
            System.out.println("Neviem posúdiť kvalitu");

    }
}

package sk.tmconsulting.ulohy;

/*
ÚLOHA:
Vytvorte jednoduchú knižnicu, kde budeme evidovať knihy (zatiaľ) podľa ich názvu. Jednoduchá knižnica bude obsahovať nasledujúce menu s možnosťami:
        1.	Zadaj novú knihu
2.	Zobraz všetky knihy
3.	Zobraz konkrétnu knihu (podľa indexu)
4.	Vymaž konkrétnu knihu (podľa indexu)
5.	Zobraz počet všetkých kníh
6.	Koniec
Používanie aplikácie: Používateľ spustí program s názvom JednoduchaKniznicaMain (SimpleLibrary), ktorý vyzve na výber z menu aplikácie. Podľa toho, čo zadá, tak buď vytvorí novú knihu (iba názov) alebo zobrazí všetky knihy. V aplikácii je možné zobraziť alebo vymazať konkrétnu knihu (podľa indexu), resp. zobraziť počet všetkých kníh. Koniec ukončí aplikáciu.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JednoduchaKniznicaMain {

    public static int vratIndexKnihy(Scanner scn) {
        String indexAkoString = scn.nextLine();
        return Integer.parseInt(indexAkoString); // Prekonvertovali sme text na cislo
    }

    public static void main(String[] args) {
        String volba = ""; // Prazdny retazec, ziadna volba
        int index = 0; // Pociatocny index knihy

        List<String> knihy = new ArrayList<>();
        Scanner scn = new Scanner(System.in);

        do {
            System.out.println("Vyber si jednu z možnosti:");
            System.out.println("1.\tZadaj novú knihu\n" +
                    "2.\tZobraz všetky knihy\n" +
                    "3.\tZobraz konkrétnu knihu (podľa indexu)\n" +
                    "4.\tVymaž konkrétnu knihu (podľa indexu)\n" +
                    "5.\tZobraz počet všetkých kníh\n" +
                    "6.\tKoniec");

            volba = scn.nextLine();

            switch (volba) {
                case "1":
                    System.out.println("Zadaj názov knihy");
                    String nazovKnihy = scn.nextLine();
                    knihy.add(nazovKnihy);
                    break;
                case "2":
                    for (String kniha : knihy)
                        System.out.println(kniha);
                    System.out.println("Toto sú vypísané všetky knihy");
                    break;
                case "3":
                    System.out.println("Zadaj číslo indexu knihy");
                    index = vratIndexKnihy(scn); // Prekonvertovali sme text na cislo
                    System.out.println(knihy.get(index));
                    break;
                case "4":
                    System.out.println("Zadaj číslo indexu knihy na zmazanie");
                    index = vratIndexKnihy(scn); // Prekonvertovali sme text na cislo
                    System.out.println(knihy.remove(index));
                    break;
                case "5":
                    System.out.println("Počet všetkých kníh je: " + knihy.size());
                    break;
                case "6":
                    //System.exit(0); // Ukonci samotnu aplikaciu
                    return; // Ukonci switch, case a zaroven aj while (loop)
            }
        } while (!volba.equals("6"));
        scn.close();
    }
}

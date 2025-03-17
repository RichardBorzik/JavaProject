import java.util.Scanner;

public class JednoduchaKalkulackaCezScannerMain {

    public static void scitanie(double cislo1, double cislo2) {
        double scitanie = cislo1 + cislo2;
        System.out.println("Výsledok sčítania " + cislo1 + " a " + cislo2 + " volaním metódy scitanie je " + scitanie);
    }

    public static double scitanieVratiVysledok(double cislo1, double cislo2) {
        return cislo1 + cislo2;
    }

    //TODO Urobit dalsie metody s navratovym typom pre odcitanie, nasobenie, delenie a modulo

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in); // Inicializacia pouzivatelskeho vstupu, tzv. Scanneru

        System.out.println("Zadaj prvé číslo");
        double a = scn.nextDouble(); // Konzola od nas "caka", aby sme zadali desatinne cislo

        System.out.println("Zadaj druhé číslo");
        double b = scn.nextDouble(); // Konzola od nas "caka", aby sme zadali desatinne cislo

        var scitanie = a + b;
        var odcitanie = a - b;
        var nasobenie = a * b;
        var oddelenie = a / b;

        //a = 7; // zmena povodnej hodnoty 5 premennej a na hodnotu 7

        System.out.printf("Výsledok sčítania %f a %f je %f %n", a, b, a + b);
        System.out.printf("Výsledok sčítania %f a %f je %f %n", a, b, scitanie);

        System.out.println("Výsledok sčítania " + a + " a " + b + " je " + (a + b));
        System.out.println("Výsledok sčítanie " + a + " a " + b + " je " + scitanie);

        // Scitanie prostrednictvom volania metody scitanie
        scitanie(a, b);
        // Scitanie prostrednictvom volania metody scitanieVratiVysledok, ktora vrati vysledok scitania
        System.out.print("Výsledok sčítania " + a + " a " + b + " je " + scitanieVratiVysledok(a, b));

    }
}

public class JednoduchaKalkulackaMain {

    public static void scitanie(double cislo1, double cislo2) {
        double scitanie = cislo1 + cislo2;
        System.out.println("Výsledok sčítania " + cislo1 + " a " + cislo2 + " volanim metódy je " + scitanie);
    }

    public static double scitanieVratiVysledok(double cislo1, double cislo2) {
        return cislo1 + cislo2;

    }

    public static void main(String[] args) {
        double a = 5.2;
        double b = 10.8;
        var scitanie = a + b;
        var odcitanie = a - b;
        var nasobenie = a * b;
        var delenie = a / b;

        a = 7; // zmena povodnej hodnoty 5 premennej a na hodnotu 7

        System.out.printf("Výsledok sčítania %f a %f je %f %n", a, b, a + b);
        System.out.printf("Výsledok sčítania %f a %f je %f %n", a, b, scitanie);

        System.out.println("Výsledok sčítania " + a + " a " + b + " je " + (a + b));
        System.out.println("Výsledok sčítanie " + a + " a " + b + " je " + scitanie);

        // Scitanie prostrednictvom volania metody scitanie
        scitanie(a,b);
        // Scitanie prostrednictvom volania metody scitanieVratiVysledok, ktora vrati vysledok scitania
        System.out.print("Výsledok sčítania " + a + " a " + b + " je " + scitanieVratiVysledok(a, b));

    }
}
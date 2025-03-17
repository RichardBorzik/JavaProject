import java.util.Scanner;

public class KruhMain {
    /*Vytvor program, ktorý vypočíta obsah a obvod obdĺžnika. Program bude fungovať tak, že používateľ zadá dĺžku a šírku prostredníctvom používateľského vstupu (konzoly) a výstupom bude výpočet obsahu a obvodu obdĺžnika.
 Rozširenie: Program pred samotným vypísanim výsledkov ponúkne používateľovi na výber, či chce vypísať obvod alebo obsah (prostredníctvom funkcie IF)
 Ak si trúfate, môžete spraviť program, ktorý vypočíta obvod a obsah KRUHU (Hunt: je potrebné zistiť ako použiť, resp. napísať Ludolfovo číslo (PI))
*/

    public static double obsah(double cislo1, double cislo2) {
        return cislo1 * cislo1;
    }

    public static double obvod(double cislo3, double cislo4) {
        return cislo3*2 + cislo4*2;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Zadaj prvé číslo");
        double a = scn.nextDouble();

        System.out.println("Zadaj druhé číslo");
        double b = scn.nextDouble();

        System.out.println("Zadaj čo chceš vypočítať? obsah = S obvod = o" );

        System.out.println("Obsah obdlznika je " + obsah(a, b));

        System.out.print("Obvod obdlznika je " + obvod(a, b));
        System.out.println(Math.PI);


    }
}

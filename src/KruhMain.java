import java.util.Scanner;

public class KruhMain {
    /*Vytvor program, ktorý vypočíta obsah a obvod obdĺžnika. Program bude fungovať tak, že používateľ zadá dĺžku a šírku prostredníctvom používateľského vstupu (konzoly) a výstupom bude výpočet obsahu a obvodu obdĺžnika.
 Rozširenie: Program pred samotným vypísanim výsledkov ponúkne používateľovi na výber, či chce vypísať obvod alebo obsah (prostredníctvom funkcie IF)
 Ak si trúfate, môžete spraviť program, ktorý vypočíta obvod a obsah KRUHU (Hunt: je potrebné zistiť ako použiť, resp. napísať Ludolfovo číslo (PI))
*/

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Zadaj polomer kruhu:");
        double r = scn.nextDouble();

        scn.nextLine();

        System.out.println("Zadaj čo chceš vypočítať? obsah = S obvod = o" );

        String volba = scn.nextLine();

        if (volba.equals("S")) {
            double obsah = Math.PI * r * r;
            System.out.println("Obsah kruhu je " + obsah);

        }else if (volba.equals("o")) {
            double obvod = 2 * Math.PI * r;
            System.out.println(" Obvod kruhu je " + obvod);
        }else {
            System.out.println("Chyba");
        }
        scn.close();
    }
}

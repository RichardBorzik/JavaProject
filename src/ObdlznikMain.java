import java.util.Scanner;

public class ObdlznikMain {
/*Vytvor program, ktorý vypočíta obsah a obvod obdĺžnika. Program bude fungovať tak, že používateľ zadá dĺžku a šírku prostredníctvom používateľského vstupu (konzoly) a výstupom bude výpočet obsahu a obvodu obdĺžnika.
 Rozširenie: Program pred samotným vypísanim výsledkov ponúkne používateľovi na výber, či chce vypísať obvod alebo obsah (prostredníctvom funkcie IF)
 Ak si trúfate, môžete spraviť program, ktorý vypočíta obvod a obsah KRUHU (Hunt: je potrebné zistiť ako použiť, resp. napísať Ludolfovo číslo (PI))
*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadaj stranu a: ");
        double a = scanner.nextDouble();

        System.out.print("Zadaj stranu b: ");
        double b = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Zadaj čo chceš vypočítať? obsah = S, obvod = o ");

        String voľba = scanner.nextLine();

        if (voľba.equals("S")) {
            double obsah = a * b;
            System.out.println("Obsah obdlžníka je " + obsah);

        } else if (voľba.equals("o")) {
            double obvod = 2 * (a + b);
            System.out.println("Obvod obdlžníka je " + obvod);
        } else {
            System.out.println("Chyba");
        }

        scanner.close();

    }
}

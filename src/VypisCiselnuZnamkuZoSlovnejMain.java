import java.util.Scanner;

public class VypisCiselnuZnamkuZoSlovnejMain {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in); //Inicializacia vstupného scannerra

        while (true) { // výraz true sposobi "nekonecny" cyklus
            System.out.println("Zadaj slovnu známku (výborný, chválitebný,dobrý, dostatočný, nedostatočný). Príkaz ´koniec´ skončí program!");
            String slovnaZnamka = scr.nextLine();

            if (slovnaZnamka.equals("výborný")) {
                System.out.println(1);
            } else if (slovnaZnamka.equals("chválitebný")) {
                System.out.println(2);
            } else if (slovnaZnamka.equals("dobrý")) {
                System.out.println(3);
            } else if (slovnaZnamka.equals("dostatočný")) {
                System.out.println(4);
            } else if (slovnaZnamka.equals("nedostatočný")) {
                System.out.println(5);
            } else if (slovnaZnamka.equals("koniec")) {
                System.out.println("KONIEC PROGRAMU");
                break;
            } else {
                System.out.println("Zadal si niečo iné!");
            }
        }
        scr.close();
    }
}




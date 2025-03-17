/*TODO Popis programu.
      Ako bude program fungovať z pohľadu používateľa: Program ho vyzve otázkou: “Zadaj známku slovne (výborný, chválitebný, dobrý, dostatočný, nedostatočný). Program bude od používateľa čakať textovú odpoveď v “konzole”. Odpoveď bude adekvátna číselná známka, ktorú program vypíše.
       Program bude ďalej pokračovať vypísaním otázky na zadanie slovnej známky, kým používateľ nepreruší program zadaním slova: koniec
        Program po zadaní koniec ukončí svoju činnosť a vypíše: KONIEC PROGRAMU
        Ošetriť diakritiku (text bez makcenov a dlznov) a farebne vypisať znamku, 1 - zelenu, 2 - zlta, 3 - oranzova, 4 - bordova, 5 - cervena
*/

import java.text.Normalizer;
import java.util.Scanner;

public class VypisCiselnuZnamkuFarebneZoSlovnejSwitchCaseMain {

    public static final String reset = "\u001B[0m";
    public static final String zelena = "\u001B[32m";
    public static final String zlta = "\u001B[33m";
    public static final String oranzova = "\u001B[38;5;214m";
    public static final String bordova = "\u001B[38;2;128;8;32m";
    public static final String cervena = "\u001B[31m";

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in); //Inicializacia vstupného scannerra

        label:
        while (true) { // výraz true sposobi "nekonecny" cyklus
            System.out.println("Zadaj slovnu známku (výborný, chválitebný,dobrý, dostatočný, nedostatočný). Príkaz ´koniec´ skončí program!");
            String slovnaZnamka = scr.nextLine();

            slovnaZnamka = normalizeText(slovnaZnamka);

            switch (slovnaZnamka) {
                case "vyborny":
                    System.out.println(zelena + "1" + reset);
                    break;
                case "chvalitebny":
                    System.out.println(zlta + "2" + reset);
                    break;
                case "dobry":
                    System.out.println(oranzova + "3" + reset);
                    break;
                case "dostatocny":
                    System.out.println(bordova + "4" + reset);
                    break;
                case "nedostatocny":
                    System.out.println(cervena + "5" + reset);
                    break;
                case "koniec":
                    System.out.println("KONIEC PROGRAMU");
                    break label;
                default:
                    System.out.println("Zadal si niečo iné!");
                    break;
            }
        }
        scr.close();
    }

    public static String normalizeText(String text) {
        text = Normalizer.normalize(text, Normalizer.Form.NFD);
        return text.replaceAll("[\\p{InCombiningDiacriticalMarks}]","").toLowerCase();
    }
}





import java.util.Scanner;

public class UrcenieSkupenstvaVodyMain {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in); //Inicializacia vstupného scannerra

        System.out.println("Zadajte hodnotu nameranej teploty vody v °C.");

        int hodnota = Integer.parseInt(scr.nextLine());
        double hodnotaFahrenheit = (hodnota * 9.0 / 5.0) + 32;

        if (hodnota < 0) {
            System.out.println("Je to pevné skupenstvo, teplota vody je " + hodnota + " °C / " + hodnotaFahrenheit + " F.");
        } else if (hodnota >= 0 && hodnota <= 100) {
            System.out.println("Je to kvapalné skupenstvo, teplota vody je " + hodnota + " °C / " + hodnotaFahrenheit + " F.");
        } else if (hodnota > 100 ) {
            System.out.println("Je to plynné skupenstvo, teplota vody je " + hodnota + " °C / " + hodnotaFahrenheit + " F.");
        } else {
            System.out.println("Zadal si niečo iné!");
        }
        scr.close();
    }
}




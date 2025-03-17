import java.util.Scanner;

public class ScannerTestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadajte vek: ");
        int vek = Integer.parseInt(scanner.nextLine()); // Prečítame ako String a konvertujeme na číslo

        System.out.print("Zadajte meno: ");
        String meno = scanner.nextLine();

        System.out.println("Vek: " + vek);
        System.out.println("Meno: " + meno);

        System.out.println("Zadajte priezvisko: ");
        String priezvisko = scanner.nextLine();

        System.out.println("Priezvisko: " + priezvisko);

        scanner.close(); //Uzatvorime scanner

    }
}

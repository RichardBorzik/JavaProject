package sk.tmconsulting.ulohy;

public class Matrix1Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 25; i++) {
            System.out.print(i + "\t");
            if (i % 5 == 0) System.out.println();
        }

        System.out.println(); // prazdny riadok

        int cislo = 1;
        int stlpce = 5;
        int riadky = 5;

        System.out.println("+----+----+----+----+----+");

        for (int i = 0; i < riadky; i++) {
            for (int j = 0; j < stlpce; j++) {
                System.out.printf("| %2d ", cislo);
                cislo++;
            }
            System.out.println("|");

            System.out.println("+----+----+----+----+----+");
        }
    }
}

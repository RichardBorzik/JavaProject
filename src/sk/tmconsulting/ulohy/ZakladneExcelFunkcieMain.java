package sk.tmconsulting.ulohy;

public class ZakladneExcelFunkcieMain {

    public static double getSum (double[] desatineCisla) {
        double suma = 0; // premenna pre sucet

        for (double cislo : desatineCisla ) {
            suma += cislo;
        }
        return suma;
    }

    public static double min(double[] desatineCisla) {
        double min = desatineCisla[0];    // dolezite deklarovat hodnotu min

        for (double cislo : desatineCisla ) {
            if (cislo < min) {
                min = cislo;
            }
        }
        return min;
    }

    public static double max(double[] desatineCisla) {
        double max = desatineCisla[0];    // dolezite deklarovat hodnotu min

        for (double cislo : desatineCisla ) {
            if (cislo > max) {
                max = cislo;
            }
        }
        return max;
    }

    public static double priemeruj (double[] desatineCisla) {

        double suma = getSum(desatineCisla); // pouzivame metodu getSum
        double pocetCisel = desatineCisla.length;

        double priemer = suma / pocetCisel;  // vzorec na priemer

        return priemer;
    }


    public static void main(String[] args) {

        double [] desatinneCisla = {5, 10.5, 20, 40.5, 80};
        //double priemer = priemeruj(desatinneCisla);
        //double sucet = getSum(desatinneCisla);

        System.out.println(priemeruj(desatinneCisla));
        System.out.println(getSum(desatinneCisla));
        System.out.println("Najmenšie číslo je: " + min(desatinneCisla));
        System.out.println("Najväčšie číslo je: " + max(desatinneCisla));
    }
}

package sk.tmconsulting.oop;

public class BankovyUcet {
    // Súkromné premenné
    private String majitel;
    private double zostatok;

    // Konštruktor
    public BankovyUcet(String majitel, double pociatocnyVklad) {
        this.majitel = majitel;
        if (pociatocnyVklad >= 0) {
            this.zostatok = pociatocnyVklad;
        } else {
            this.zostatok = 0;
            System.out.println("Počiatočný vklad nemôže byť záporný.");
        }
    }

    // Getter pre majiteľa
    public String getMajitel() {
        return majitel;
    }

    // Getter pre zostatok
    public double getZostatok() {
        return zostatok;
    }

    // Metóda na vklad
    public void vloz(double suma) {
        if (suma > 0) {
            zostatok += suma;
            System.out.println("Vložené: " + suma + " €");
        } else {
            System.out.println("Suma na vklad musí byť kladná.");
        }
    }

    // Metóda na výber
    public void vyber(double suma) {
        if (suma > 0 && suma <= zostatok) {
            zostatok -= suma;
            System.out.println("Vybrané: " + suma + " €");
        } else {
            System.out.println("Neplatná suma na výber.");
        }
    }

    // Zobrazenie stavu účtu
    public void zobrazStav() {
        System.out.println("Majiteľ účtu: " + majitel);
        System.out.println("Aktuálny zostatok: " + zostatok + " €");
    }

    // Hlavná metóda
    public static void main(String[] args) {
        BankovyUcet ucet = new BankovyUcet("Ján Novák", 100);
        ucet.zobrazStav();

        System.out.println();
        ucet.vloz(50);    // OK
        ucet.vyber(30);   // OK
        ucet.vyber(200);  // Neplatná suma
        ucet.vloz(-10);   // Neplatná suma

        System.out.println();
        ucet.zobrazStav();
    }
}


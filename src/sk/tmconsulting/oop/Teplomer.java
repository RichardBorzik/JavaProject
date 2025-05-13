package sk.tmconsulting.oop;

public class Teplomer {
    private double teplotaC; // teplota v stupňoch Celzia

    // Konštruktor
    public Teplomer(double teplotaC) {
        setTeplotaC(teplotaC); // využívame setter aj tu kvôli validácii
    }

    // Setter s kontrolou rozsahu
    public void setTeplotaC(double teplotaC) {
        this.teplotaC = teplotaC;
    }

    public boolean isTeplotaCValid(double teplotaC) {
        if (teplotaC >= -100 && teplotaC <= 100) {
            return true;
        } else {
            return false;
        }
    }

    // Getter pre teplotu v Celsius
    public double getTeplotaC() {
        // Zaokruhlenie mozeme urobit priamo v getteri
        return teplotaC;
    }

    // Getter pre teplotu vo Fahrenheit
    public double getTeplotaF() {
        return teplotaC * 9 / 5 + 32;
    }

    // Zobrazenie teploty
    public void zobrazTeplotu() {
        System.out.println("Teplota: " + teplotaC + " °C");
        System.out.println("Teplota: " + getTeplotaF() + " °F");
    }

    // Hlavná metóda
    public static void main(String[] args) {
        Teplomer t1 = new Teplomer(25.5);

        // Nastavujeme novu teplotu pre existujuci teplomer
        double planovanaTeplota = -150;

        if (t1.isTeplotaCValid(planovanaTeplota))
            t1.setTeplotaC(planovanaTeplota);

        t1.zobrazTeplotu();
    }
}


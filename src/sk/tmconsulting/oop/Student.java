package sk.tmconsulting.oop;

public class Student {
    private String meno;
    private int znamka;

    public Student(String meno, int znamka) {
        this.meno = meno;
        setZnamka(znamka);
    }

    public String getMeno() {
        return meno;
    }

    public int getZnamka() {
        return znamka;
    }

    public boolean setZnamka(int znamka) {
        if (znamka >= 1 && znamka <= 5) {
            this.znamka = znamka;
            return true;
        } else {
            return false;
        }
    }

    public void zobrazInfo() {
        System.out.println("Študent: " + meno);
        System.out.println("Známka: " + znamka);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ján Novák", 2);
        s1.zobrazInfo();

        System.out.println();

        if (!s1.setZnamka(6)) {
            System.out.println("Neplatná známka! Povolené sú iba hodnoty 1 až 5.");
        }

        if (s1.setZnamka(1)) {
            s1.zobrazInfo();
        }
    }
}


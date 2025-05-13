package sk.tmconsulting.oop;

public class StudentException {
    private String meno;
    private int znamka;

    public StudentException(String meno, int znamka) {
        this.meno = meno;
        setZnamka(znamka);
    }

    public String getMeno() {
        return meno;
    }

    public int getZnamka() {
        return znamka;
    }

    public void setZnamka(int znamka) {
        if (znamka < 1 || znamka > 5) {
            throw new IllegalArgumentException("Známka musí byť medzi 1 a 5.");
        }
        this.znamka = znamka;
    }

    public void zobrazInfo() {
        System.out.println("Študent: " + meno);
        System.out.println("Známka: " + znamka);
    }

    public static void main(String[] args) {
        try {
            StudentException s1 = new StudentException("Jana Horáková", 3);
            s1.zobrazInfo();

            System.out.println();

            s1.setZnamka(7); // Bude výnimka
        } catch (IllegalArgumentException e) {
            System.out.println("Chyba: " + e.getMessage());
        }

        System.out.println();

        try {
            StudentException s2 = new StudentException("Peter Kováč", 1);
            s2.zobrazInfo();
        } catch (IllegalArgumentException e) {
            System.out.println("Chyba: " + e.getMessage());
        }
    }
}


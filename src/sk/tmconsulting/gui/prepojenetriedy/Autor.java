package sk.tmconsulting.gui.prepojenetriedy;

public class Autor {
    private String meno;
    private String priezvisko;
    private int rokNarodenia;
    private String bydlisko;

    public Autor(String meno, String priezvisko, int rokNarodenia, String bydlisko) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.rokNarodenia = rokNarodenia;
        this.bydlisko = bydlisko;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public int getRokNarodenia(int rokNarodenia) {
        return rokNarodenia;
    }

    public void setRokNarodenia(int rokNarodenia) {
        this.rokNarodenia = rokNarodenia;
    }

    public String getBydlisko(String bydlisko) {
        return bydlisko;
    }

    public void setBydlisko(String bydlisko) {
        this.bydlisko = bydlisko;
    }

    public String toString() {
        return "Meno: " + meno + System.lineSeparator() + "Priezvisko: " + priezvisko + System.lineSeparator() + "Rok narodenia: " + rokNarodenia + System.lineSeparator() + "Bydlisko: " + bydlisko;

    }
}

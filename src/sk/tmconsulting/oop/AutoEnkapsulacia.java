package sk.tmconsulting.oop;

public class AutoEnkapsulacia {
    private String znacka;
    private int rokVyroby;

    public AutoEnkapsulacia() {
        znacka = "Neznáma";
        rokVyroby = 0;
    }

    public AutoEnkapsulacia(String znacka, int rokVyroby) {
        this.znacka = znacka;
        this.rokVyroby = rokVyroby;
    }

    public String getZnacka() {
        return znacka;
    }

    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

    public int getRokVyroby() {
        return rokVyroby;
    }

    public void setRokVyroby(int rokVyroby) {
        this.rokVyroby = rokVyroby;
    }
}
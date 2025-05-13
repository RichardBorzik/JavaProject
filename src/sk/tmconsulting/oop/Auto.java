package sk.tmconsulting.oop;

public class Auto {
    String znacka;
    int rokVyroby;

    public Auto() {
        znacka = "Neznáma";
        rokVyroby = 0;
    }

    public Auto(String znacka, int rokVyroby) {
        this.znacka = znacka;
        this.rokVyroby = rokVyroby;
    }

    public void zobrazAuto() {
        System.out.println("\nZnačka: " + znacka);
        System.out.println("Rok výroby: " + rokVyroby);
    }

}
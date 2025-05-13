package sk.tmconsulting.oop;

public class Kniha {
    String nazov;
    int rokVydania;
    String autor; // autor bude obsahovat meno a priezvisko
    int pocetStran;
    String vydavatelstvo; // pouzijeme iba jeho nazov

    public Kniha(String nazov, int rokVydania, String autor, int pocetStran, String vydavatelstvo) {
        this.nazov = nazov;
        this.rokVydania = rokVydania;
        this.autor = autor;
        this.pocetStran = pocetStran;
        this.vydavatelstvo = vydavatelstvo;
    }

    public Kniha() {
        nazov = "Já, robot";
        autor = "Isaac Asimov";
        rokVydania = 1960;
        pocetStran = 289;
        vydavatelstvo = "Asimov Inc.";
    }
}

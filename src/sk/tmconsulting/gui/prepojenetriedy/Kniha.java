package sk.tmconsulting.gui.prepojenetriedy;

public class Kniha {
    private String nazovKnihy;
    private int pocetStran;
    private int rokVydania;
    private String vydavatelstvo;
    private Autor autor; // prepojenie an onú triedu

    public Kniha(String nazovKnihy,int pocetStran, int rokVydania, String vydavatelstvo, Autor autor){
        this.nazovKnihy = nazovKnihy;
        this.pocetStran = pocetStran;
        this.rokVydania = rokVydania;
        this.vydavatelstvo = vydavatelstvo;
        this.autor = autor;
    }

    public String getNazovKnihy() {
        return nazovKnihy;
    }

    public void setNazovKnihy(String nazovKnihy) {
        this.nazovKnihy = nazovKnihy;
    }

    public int getPocetStran() {
        return pocetStran;
    }

    public void setPocetStran(int pocetStran) {
        this.pocetStran = pocetStran;
    }

    public int getRokVydania() {
        return rokVydania;
    }

    public void setRokVydania(int rokVydania) {
        this.rokVydania = rokVydania;
    }

    public String getVydavatelstvo() {
        return vydavatelstvo;
    }

    public void setVydavatelstvo(String vydavatelstvo) {
        this.vydavatelstvo = vydavatelstvo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void zobrazInfo() {
        System.out.println("Názov knihy: " + nazovKnihy);
        System.out.println("Rozsah: " + pocetStran + " strán");
        System.out.println("Rok vydania: " + rokVydania);
        System.out.println("Vydavateľstvo: " + vydavatelstvo);
        System.out.println(autor.toString());
    }
}

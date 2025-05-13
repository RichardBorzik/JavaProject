package sk.tmconsulting.ulohy.oop.chatgpt;

// Podtrieda Kruh
public class Kruh extends Tvar {
    private double polomer;

    public Kruh (double polomer) {
        super("Kruh");
        this.polomer = polomer;
    }

    @Override
    public double vypocitajObsah() {
        return Math.PI * polomer * polomer;
    }
}

package sk.tmconsulting.oop;

public class VyrobaAutMain {

    public static void main(String[] args) {
        // Vytvorenie objektu pomocou predvoleného konštruktora
        Auto auto1 = new Auto();
        auto1.zobrazAuto();

        // Vytvorenie objektu pomocou konštruktora s parametrami
        Auto auto2 = new Auto("Toyota", 2015);
        auto2.zobrazAuto();

    }
}

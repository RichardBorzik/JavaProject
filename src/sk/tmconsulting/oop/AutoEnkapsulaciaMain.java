package sk.tmconsulting.oop;

public class AutoEnkapsulaciaMain {
    public static void main(String[] args) {
        AutoEnkapsulacia auto1 = new AutoEnkapsulacia();
        System.out.println(auto1.getZnacka());
        System.out.println(auto1.getRokVyroby());

        System.out.println("Naplnil som atribúty auta konkrétnymi údajmi");
        auto1.setZnacka("Škoda");
        auto1.setRokVyroby(2025);

        System.out.println(auto1.getZnacka());
        System.out.println(auto1.getRokVyroby());
    }
}

package sk.tmconsulting.oop.abstrakcia;

public class Main {
    public static void main(String[] args) {
        Pig pig1 = new Pig();
        pig1.animalSound();
        pig1.sleep();
        System.out.println("Počet nôh: " + pig1.feet);

        Horse horse1 = new Horse();
        horse1.animalSound();
        horse1.sleep();
        System.out.println("Počet nôh: " + horse1.feet);
    }
}

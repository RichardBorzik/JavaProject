package sk.tmconsulting.oop.abstrakcia;

abstract class Animal {
    protected int feet = 4;
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
}

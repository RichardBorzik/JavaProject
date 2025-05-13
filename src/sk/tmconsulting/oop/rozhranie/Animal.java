package sk.tmconsulting.oop.rozhranie;

// interface
interface Animal {
    public void animalSound(); // interface method (does not have a body)
    public void run(); // interface method (does not have a body)
    public void jump();
    default void showFeet() {
        System.out.println("Toto zviera má 4 nohy");
    }
}

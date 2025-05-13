package com.w3schools.príklady.oop;

// Create a Main class
public class ConstructorMain {
    int x;  // Create a class attribute
    String name;
    String lastName;

    // Create a class constructor for the Main class
    public ConstructorMain() {
        x = 5;  // Set the initial value for the class attribute x
        name = "Jožko";
        lastName = "Mrkvička";
    }

    public ConstructorMain (int x) {
        this.x = x; // this.x sa odkazuje na premennu (atribut) triedy, obycajne x je parameter metody
    }

    public ConstructorMain (String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

    }

    public static void main(String[] args) {
        ConstructorMain myObj = new ConstructorMain(); // Create an object of class Main (This will call the constructor)
        System.out.println(myObj.x); // Print the value of x, the result is 5

        ConstructorMain myObj2 = new ConstructorMain(10);
        System.out.println(myObj2.x); // Print the value of x, the result is 10

        ConstructorMain myObj3 = new ConstructorMain("Jozef", "Mak");
        System.out.println(myObj3.name + " " + myObj3.lastName);
    }
}

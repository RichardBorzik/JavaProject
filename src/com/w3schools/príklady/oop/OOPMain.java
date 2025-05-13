package com.w3schools.príklady.oop;

public class OOPMain {
    int x = 5;
    final double DPH = 0.20; // Premenna zadefinova ako konstanta
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        OOPMain myObj = new OOPMain();// Vytvaram objekt (instanciu triedy) myObj
        myObj.x = 40;
        //myObj.DPH = 0.30; // Nie je mozne zmenit
        System.out.println(myObj.x); // Vypiseme obsah premennej x. Premenna x je vlastne premenna (atribut) triedy OOPMain

        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);

    }
}

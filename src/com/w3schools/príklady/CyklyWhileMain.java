package com.w3schools.príklady;

public class CyklyWhileMain {
    public static void main(String[] args) {

        int i = 0;
        // cyklus while s podminekou na zaciatku
        while (i < 5) {
            System.out.println(i);
            i++; // inkrementacia hodnoty (zvysenie hodnoty o +1) premennej i
        }

        System.out.println();

        i = 5;
        // cyklus s podmienkou na konci
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);


    }
}

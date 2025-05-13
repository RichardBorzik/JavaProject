package com.w3schools.príklady.oop;

public class ParametricConstructorMain {
    int x;

    public ParametricConstructorMain(int y) {
        x = y;
    }

    public static void main(String[] args) {
        ParametricConstructorMain myObj = new ParametricConstructorMain(5);
        System.out.println(myObj.x);
    }
}

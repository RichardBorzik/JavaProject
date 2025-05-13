package com.w3schools.príklady.oop;

public class ConstructorCarMain {
    int modelYear;
    String modelName;

    public ConstructorCarMain(int modelYear, String modelName) {
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public static void main(String[] args) {
        ConstructorCarMain myCar = new ConstructorCarMain(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}

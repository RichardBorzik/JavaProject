package sk.tmconsulting.greetings;

import sk.tmconsulting.greetings.english.Hello;
import sk.tmconsulting.greetings.german.Hallo;
import sk.tmconsulting.greetings.hungarian.Szia;
import sk.tmconsulting.greetings.slovak.Ahoj;

public class AllGreetingsMain {
    public static void main(String[] args) {
        Hello.sayHello();
        Hallo.sayHello();
        Szia.sayHello();
        Ahoj.sayHello();
    }
}
package org.example;

import org.example.concepts.basics.DataTypesExm;
import org.example.concepts.basics.InnOutEx;
import org.example.concepts.basics.StringsExm;
import org.example.concepts.oop.classesobjects.ClzNObjsEx;
import org.example.concepts.oop.inheritanceExamples.Animal;
import org.example.concepts.oop.inheritanceExamples.Bird;

public class App {

    // MAIN METHOD
    public static void main(String[] args) {

        start();

        welcome("Programmer");

        System.out.println(getGreeting("Developer"));

        System.out.println("==================================");

        // TESTING PRACTICLES GO BELOW
        Animal animalObj = new Animal();
        animalObj.myself();

        Bird tweety = new Bird("Tweety", true, 2, "Bird");
        tweety.birdSing();

    }

    // FIRST METHOD (SHOW APP HAS STARTED)
    public static void start() {
        System.out.println("Application Has Started");
    }

    // PASSING A VALUE
    public static void welcome(String name) {
        System.out.println("Welcome " + name);
    }

    // SHOWCASE THE USE OF RETURN
    public static String getGreeting(String name) {
        return "Hello " + name;
    }

}

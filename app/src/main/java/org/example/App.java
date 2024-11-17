package org.example;

import org.example.concepts.basics.DataTypesExm;
import org.example.concepts.basics.InnOutEx;
import org.example.concepts.basics.StringsExm;
import org.example.concepts.oop.abstraction.AbsChild;
import org.example.concepts.oop.classesobjects.ClzNObjsEx;
import org.example.concepts.oop.classesobjects.InnerClzExm;
import org.example.concepts.oop.inheritanceExamples.Animal;
import org.example.concepts.oop.inheritanceExamples.Bird;
import org.example.concepts.oop.polyEx.Employee;
import org.example.concepts.oop.polyEx.Human;

public class App {

    // MAIN METHOD
    public static void main(String[] args) {

        start();

        welcome("Programmer");

        System.out.println(getGreeting("Developer"));

        System.out.println("==================================");

        // TESTING PRACTICLES GO BELOW
        // Create an instance of the outer class to access non-static inner class and
        // its methods
        InnerClzExm outerClass = new InnerClzExm();

        // Demonstrate non-static inner class
        InnerClzExm.InnerClass innerClassInstance = outerClass.new InnerClass();
        System.out.println("Non-static Inner Class - myNormalInnerMethod: " + innerClassInstance.myNormalInnerMethod());

        // Demonstrate static inner class
        // Access static inner class directly (without outer class instance)
        InnerClzExm.StaticInnerClz staticInnerClassInstance = new InnerClzExm.StaticInnerClz();

        // Demonstrate static inner class method 1
        System.out
                .println("Static Inner Class - myStaticInnerMethod: " + staticInnerClassInstance.myStaticInnerMethod());

        // Demonstrate static inner class method 2
        staticInnerClassInstance.myStaticMethodTwo();

        System.out.println("==================================");

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

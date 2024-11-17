package org.example.concepts.oop.polyEx;

public class Employee extends Human {

    // first method
    public void sameMethod() {
        System.out.println("Im an Employee");
    }

    // Method Overloading
    // second method
    public void sameMethod(String name){
        System.out.println("Im "+ name );
    }
}

/*
 * in app java
 * Human minisa = new Human();
 * minisa.sameMethod();
 * 
 * Employee jack = new Employee();
 * jack.sameMethod();
 */

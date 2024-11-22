package org.example.concepts.oop.abstractionandmore;

//interface is a completely "abstract class" that is used to group related methods with empty bodies

// interfaces cannot be used to create objects
public interface InterfaceExm {
    // Interface attributes are by default public, static and final(Constants)
    int MAX_AGE = 100;

    // Interface methods are by default abstract and public
    // interface does not have a body
    public void animalSound();

    public void run();
}

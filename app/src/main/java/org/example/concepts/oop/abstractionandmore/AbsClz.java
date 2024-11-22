package org.example.concepts.oop.abstractionandmore;

//Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

//Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

abstract class AbsClz {
    
    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }
}

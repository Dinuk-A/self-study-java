package org.example.concepts.oop.abstraction;

// a class can only inherit from one superclass
public class AbsChild extends AbsClz {

    public void animalSound() {
        System.out.println("Animal Speaks");
    }

}

/*
 * app
 * 
 * AbsChild objAbsChild = new AbsChild();
 * objAbsChild.animalSound();
 * objAbsChild.sleep();
 */

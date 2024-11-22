package org.example.concepts.oop.abstractionandmore;

// class can implement multiple interfaces (separate with comma)
public class IntfcChild implements InterfaceExm {

    // IntfcChild must implement ALL the inherited abstract methods
    public void animalSound() {
        System.out.println("Animal");
    }

    public void run() {
        System.out.println("Animal run");
    }

    // child can have their own things too
    private String something;

    public void nativeMethod() {
        System.out.println("native method");
    }

    // AbsChild objAbsChild = new AbsChild();
    // objAbsChild.animalSound();
    // objAbsChild.sleep();

}

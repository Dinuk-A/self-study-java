package org.example.concepts.oop.inheritanceExamples;

//any class that isnt 'final' can be a super class( final class Animal) 

public class Bird extends Animal {

    private String petName;

    public Bird(String petName, boolean canFly, int legCount, String type) {

        // super class constructor
        super(legCount, "Bird", canFly);
        this.petName = petName;
    }

    public void birdSing() {
        System.out.println(petName + " sings 🦅");
    }
}

/*
 * in app.java
 * 
 * Animal animalObj = new Animal();
 * animalObj.myself();
 * 
 * Bird tweety = new Bird("Tweety", true, 2, "Bird");
 * tweety.birdSing();
 */
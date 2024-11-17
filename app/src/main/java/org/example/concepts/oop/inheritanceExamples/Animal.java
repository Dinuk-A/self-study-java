package org.example.concepts.oop.inheritanceExamples;

public class Animal {

    private int legCount;
    private String type;
    private boolean canFly;

    // all Constructor
    public Animal(int legCountValOfNewObj, String typeValOfNewObj, boolean canFlyValOfNewObj) {
        this.legCount = legCountValOfNewObj;
        this.type = typeValOfNewObj;
        this.canFly = canFlyValOfNewObj;
    }

    public Animal(){
        
    }

    // Getters
    public int getLegCount() {
        return legCount;
    }

    public String getType() {
        return type;
    }

    public boolean canFly() {
        return canFly;
    }

    // Setters
    public void setLegCount(int legCountValOfNewObj) {
        this.legCount = legCountValOfNewObj;
    }

    public void setType(String typeValOfNewObj) {
        this.type = typeValOfNewObj;
    }

    public void setCanFly(boolean canFlyValOfNewObj) {
        this.canFly = canFlyValOfNewObj;
    }

    public void myself() {
        System.out.println("I'm an animal.");
    }

}

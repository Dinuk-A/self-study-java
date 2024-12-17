package org.example.utils.jsonnnn;

//just todemonstrate json object creation

public class Person {
    
    private String name;
    private int age;

    //constructors
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Person(){}

    //getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    //override toString method to display nicely
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

}

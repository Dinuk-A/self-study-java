package org.example.concepts.oop.classesobjects;

//A constructor in Java is a special method used to initialize objects. It is called when an object of a class is created

public class ClzConstructorsEx {

    String productName;
    double price;
    int stock;

    // default constructor
    public ClzConstructorsEx() {

    }

    // all args Constructor
    public ClzConstructorsEx(String productName, double price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    //custom constructors
    

    // calling the default constructor in another method
    // can give values later (via setters)
    // ClzConstructorsEx objName = new ClzConstructorsEx();

    // calling all args constructor
    // ClzConstructorsEx objName = new ClzConstructorsEx("Cat" , 45000, 10);

}

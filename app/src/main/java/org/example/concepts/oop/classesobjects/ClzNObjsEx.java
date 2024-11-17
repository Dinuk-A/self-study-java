package org.example.concepts.oop.classesobjects;

//create a class
public class ClzNObjsEx {
    int x = 5;
    int y;
    String name = "this is name";
    final int z = 150;

    // create a static method (static === can invoke this method inside another
    // class or method without creating ClzNObjsEx objects )
    public static void createObj() {

        // create a object (inside Main or inside another class)
        // multiple instances from same class can be created inside the same method
        ClzNObjsEx myObj = new ClzNObjsEx();

        // access class attributes with dot syntax
        System.out.println(myObj.name);

        // set values for empty attributes
        myObj.y = 99;
    }

    // create another method inside same class
    public static void createObjTwo() {

        // create a object #2 from the same class
        ClzNObjsEx myObjTwo = new ClzNObjsEx();

        // modify(override) values if the attribute isnt 'final'
        myObjTwo.x = 55;
        System.out.println(myObjTwo.x);
    }

    // non static method
    // to call this, a class must be created
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // method with params
    public static void methodWithParam(String paramNameHere) {
        System.out.println("The passed param is " + paramNameHere);
    }
}

/*
 * IN MAIN >>>
 * ClzNObjsEx.createObj();
 * ClzNObjsEx.createObjTwo();
 * ClzNObjsEx.methodWithParam("Cat");
 */
package org.example.concepts.basics;

public class DataTypesExm {

    // Primitive types
    int itemCount = 50;
    float costPerItem = 75.50f;
    char currency = '$'; // single quotes
    boolean isAvailable = true;
    // more === double, byte, short

    // Non primitive
    String shopName = "ABC Store"; // double quotes
    //more === arrays, maps, objects, etc

    // ===================================
    // TYPE CASTING

    // 1 Widening Casting (automatically)
    // byte -> short -> char -> int -> long -> float -> double
    int myInt = 7;
    double myDouble = myInt;

    // 2 Narrowing Casting (manually)
    // double -> float -> long -> int -> char -> short -> byte
    double myDoubleTwo = 9.78d;
    int myIntTwo = (int) myDouble;

    //String cant be type casted...its a non primitive type, to do that Wrappers are needed

}

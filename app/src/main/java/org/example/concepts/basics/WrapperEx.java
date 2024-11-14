package org.example.concepts.basics;

/*
 * In Java, wrappers are special classes that encapsulate primitive data types into objects. This allows primitives (which are not objects) to be used in scenarios where objects are required, such as in collections (e.g., ArrayList) or when we need to pass a value as an object
 */

public class WrapperEx {

    // Autoboxing: Automatically converting a primitive type to its wrapper class
    public static void autoboxingExample() {
        int num = 10;
        Integer wrapperNum = num; // Autoboxing: int -> Integer
        System.out.println("Autoboxing Example: " + wrapperNum); // Output: 10
    }

    // Unboxing: Converting a wrapper class back to its primitive type
    public static void unboxingExample() {
        Integer wrapperNum = Integer.valueOf(10);
        int num = wrapperNum; // Unboxing: Integer -> int
        System.out.println("Unboxing Example: " + num); // Output: 10
    }

    // Parsing: Converting a String to a primitive using wrapper classes
    public static void parsingExample() {
        String intStr = "123";
        int num = Integer.parseInt(intStr); // Convert String to int
        System.out.println("Parsing Example: " + num); // Output: 123

        String doubleStr = "3.14";
        double d = Double.parseDouble(doubleStr); // Convert String to double
        System.out.println("Parsing Example: " + d); // Output: 3.14
    }

    // Using valueOf method to convert String to wrapper object
    public static void valueOfExample() {
        String intStr = "123";
        Integer wrapperNum = Integer.valueOf(intStr); // Converts String to Integer object
        System.out.println("valueOf Example: " + wrapperNum); // Output: 123

        String doubleStr = "3.14";
        Double wrapperDouble = Double.valueOf(doubleStr); // Converts String to Double object
        System.out.println("valueOf Example: " + wrapperDouble); // Output: 3.14
    }

    // Comparing wrapper class objects using equals method
    public static void equalsExample() {
        Integer num1 = 100;
        Integer num2 = 100;
        System.out.println("Are the wrapper objects equal? " + num1.equals(num2)); // Output: true

        // Integer num3 = new Integer(200);
        // Integer num4 = new Integer(200);

        Integer num3 = Integer.valueOf(200); // Use valueOf() instead of new Integer()
        Integer num4 = Integer.valueOf(200); // Use valueOf() instead of new Integer()

        System.out.println("Are the wrapper objects equal? " + num3.equals(num4)); // Output: true
    }

    // Demonstrating the use of hashCode with wrapper classes
    public static void hashCodeExample() {
        Integer num = Integer.valueOf(100);
        System.out.println("hashCode Example: " + num.hashCode()); // Output: 100
    }

    // Working with the `toString` method of wrapper classes
    public static void toStringExample() {
        Integer num = 42;
        System.out.println("toString Example: " + num.toString()); // Output: "42"
    }

    // Checking if a wrapper class can represent a value within its range
    public static void maxMinValueExample() {
        System.out.println("Max Value of Integer: " + Integer.MAX_VALUE); // Output: 2147483647
        System.out.println("Min Value of Integer: " + Integer.MIN_VALUE); // Output: -2147483648
    }

    // Using compareTo() to compare wrapper objects
    public static void compareToExample() {
        Integer num1 = 10;
        Integer num2 = 20;
        System.out.println("CompareTo Example: " + num1.compareTo(num2)); // Output: -1 (num1 is smaller than num2)
    }

    // Demonstrating the use of wrapper class constants
    public static void constantsExample() {
        System.out.println("Boolean TRUE: " + Boolean.TRUE); // Output: true
        System.out.println("Boolean FALSE: " + Boolean.FALSE); // Output: false
    }

    // Wrapper class for primitive boolean
    public static void booleanWrapperExample() {
        Boolean bool = Boolean.valueOf("true"); // Converts String "true" to Boolean object
        System.out.println("Boolean Wrapper Example: " + bool); // Output: true
    }

    public static void shoppingCartExample() {
        // Defining item prices and quantities
        Integer item1Price = 20; // Autoboxed to Integer
        Integer item2Price = 15; // Autoboxed to Integer
        Integer item1Quantity = 3; // Autoboxed to Integer
        Integer item2Quantity = 2; // Autoboxed to Integer

        // Calculating total price (item price * quantity)
        Integer totalPriceItem1 = item1Price * item1Quantity; // Unboxing and calculation
        Integer totalPriceItem2 = item2Price * item2Quantity; // Unboxing and calculation

        // Sum of total price
        Integer grandTotal = totalPriceItem1 + totalPriceItem2; // Unboxing and addition

        // Displaying the result
        System.out.println("Total Price for Item 1: " + totalPriceItem1);
        System.out.println("Total Price for Item 2: " + totalPriceItem2);
        System.out.println("Grand Total Price: " + grandTotal);
    }

}

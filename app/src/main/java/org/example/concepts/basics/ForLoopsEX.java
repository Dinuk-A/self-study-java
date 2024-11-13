package org.example.concepts.basics;

public class ForLoopsEX {

    public static void fLMethod() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    public static void nestedFLMethod() {
        // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }
    }

    public static void forEachEx() {
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String i : cars) {
            System.out.println(i);
        }

    }

    public static void breakNContinueEx() {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
                // stops the loop when i is equal to 4:
            }
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
                // skips the value of 4
            }
            System.out.println(i);
        }
    }

}

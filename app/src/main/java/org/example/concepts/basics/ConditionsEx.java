package org.example.concepts.basics;

public class ConditionsEx {

    public static void IfElsemethod() {
        int myNum = 10;

        if (myNum > 0) {
            System.out.println("The value is a positive number.");
        } else if (myNum < 0) {
            System.out.println("The value is a negative number.");
        } else {
            System.out.println("The value is 0.");
        }
    }

    public static void switchExMethod() {
        int day = 4;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
    }

    public static void whileExMethod() {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }

    public static void doWhileExMethod() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }
}

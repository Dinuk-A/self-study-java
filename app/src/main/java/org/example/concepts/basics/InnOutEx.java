package org.example.concepts.basics;

import java.util.Scanner;

public class InnOutEx {

    // 1
    public static void inputsAddMethod() {

        Scanner myScannerObj = new Scanner(System.in);

        System.out.println("Enter #1 : ");
        int firstNum = myScannerObj.nextInt();

        System.out.println("Enter #2 : ");
        int secondNum = myScannerObj.nextInt();

        myScannerObj.close();

        System.out.println("Sum is : " + (firstNum + secondNum));
    }

    // 2
    public static void basicDataTypeInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a double:");
        double doubleVal = scanner.nextDouble();
        System.out.println("Enter a float:");
        float floatVal = scanner.nextFloat();
        System.out.println("Enter a boolean:");
        boolean boolVal = scanner.nextBoolean();
        System.out.println("Double: " + doubleVal + ", Float: " + floatVal + ", Boolean: " + boolVal);
        scanner.close();
    }

    // 3
    public static void menuExample() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose an option: ");
            System.out.println("1. Say Hello");
            System.out.println("2. Display current time");
            System.out.println("3. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello!");
                    break;
                case 2:
                    System.out.println("Current time: " + java.time.LocalTime.now());
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 3);
        scanner.close();
    }

    // 4
    public static void safeInputExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        try {
            int num = scanner.nextInt();
            System.out.println("You entered: " + num);
        } catch (Exception e) {
            System.out.println("Invalid input, please enter an integer.");
        } finally {
            scanner.close();
        }
    }

    // 5
    public static void demonstrateScannerIssue() {
        // Create a new Scanner instance to read input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");

        // Use nextInt() to read an integer input
        int number = scanner.nextInt();
        // At this point, nextInt() has read the integer but left the newline character
        // ('\n') in the input buffer

        // Use an extra nextLine() to consume the leftover newline character
        // This prevents the next nextLine() call from reading the leftover newline
        scanner.nextLine();

        // Now, prompt the user for their name
        System.out.println("Enter your name:");
        // nextLine() will now read the full line of input as expected
        String name = scanner.nextLine();

        // Display the gathered information
        System.out.println("You entered the number: " + number);
        System.out.println("You entered the name: " + name);

        // Close the Scanner to release system resources
        scanner.close();
    }

}

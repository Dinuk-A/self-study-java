package org.example.concepts.basics;

public class ExceptionHandlingEx {

    // Lesson 1: Basic try-catch block
    public static void basicTryCatch() {
        try {
            // Code that may throw an exception
            int result = 10 / 0; // Division by zero will cause ArithmeticException
        } catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("Error: " + e.getMessage()); // Print the exception message
        }
    }

    // Lesson 2: Catching multiple exceptions
    public static void catchMultipleExceptions() {
        try {
            // Code that may throw multiple exceptions
            String str = null;
            System.out.println(str.length()); // NullPointerException
            int[] numbers = new int[2];
            numbers[3] = 10; // ArrayIndexOutOfBoundsException
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds: " + e.getMessage());
        }
    }

    // Lesson 3: Using finally block
    public static void useFinally() {
        try {
            System.out.println("Inside try block");
            int result = 10 / 2;
        } catch (ArithmeticException e) {
            System.out.println("Error in arithmetic operation");
        } finally {
            // This block will always execute, even if an exception occurs
            System.out.println("Finally block is always executed");
        }
    }

    // Lesson 4: Throwing custom exceptions
    public static void throwCustomException() throws InvalidAgeException {
        int age = -5;
        if (age < 0) {
            // Throw custom exception
            throw new InvalidAgeException("Age cannot be negative");
        }
        System.out.println("Age is: " + age);
    }

    // Lesson 5: Creating and using a custom exception
    public static void useCustomException() {
        try {
            throwCustomException();
        } catch (InvalidAgeException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }

    // Lesson 6: Nested try-catch blocks
    public static void nestedTryCatch() {
        try {
            try {
                int result = 10 / 0; // ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Inner try-catch: " + e.getMessage());
                throw new Exception("Throwing exception from inner block");
            }
        } catch (Exception e) {
            System.out.println("Outer try-catch: " + e.getMessage());
        }
    }

    // Lesson 7: Exception chaining
    public static void exceptionChaining() {
        try {
            try {
                int result = 10 / 0; // ArithmeticException
            } catch (ArithmeticException e) {
                throw new Exception("New exception caused by: " + e.getMessage(), e);
            }
        } catch (Exception e) {
            System.out.println("Exception chaining: " + e.getMessage());
            System.out.println("Caused by: " + e.getCause());
        }
    }

    // Main method to run all the lessons
    // public static void main(String[] args) {
    //     System.out.println("Lesson 1: Basic try-catch block");
    //     basicTryCatch();

    //     System.out.println("\nLesson 2: Catching multiple exceptions");
    //     catchMultipleExceptions();

    //     System.out.println("\nLesson 3: Using finally block");
    //     useFinally();

    //     System.out.println("\nLesson 4: Throwing custom exceptions");
    //     try {
    //         throwCustomException();
    //     } catch (InvalidAgeException e) {
    //         System.out.println("Caught custom exception: " + e.getMessage());
    //     }

    //     System.out.println("\nLesson 5: Using a custom exception");
    //     useCustomException();

    //     System.out.println("\nLesson 6: Nested try-catch blocks");
    //     nestedTryCatch();

    //     System.out.println("\nLesson 7: Exception chaining");
    //     exceptionChaining();
    // }
}

// Custom exception class for Lesson 4 and 5
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

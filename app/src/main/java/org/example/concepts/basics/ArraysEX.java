package org.example.concepts.basics;

import java.util.ArrayList;  // For ArrayList demonstration

public class ArraysEX {

    // Method to define arrays in different ways
    public static void defineArrays() {
        // 1. Array with predefined values
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Predefined Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 2. Empty Array with a fixed size
        String[] names = new String[3];  // Array of size 3
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";
        System.out.println("Array with predefined size and values: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();

        // 3. Using Arrays.fill to initialize array with the same value
        int[] filledArray = new int[5];
        java.util.Arrays.fill(filledArray, 10);  // Fill all elements with 10
        System.out.println("Filled Array: ");
        for (int num : filledArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to get elements from an array (access by index)
    public static void getElementFromArray() {
        int[] numbers = {5, 10, 15, 20};
        System.out.println("Element at index 2: " + numbers[2]);  // Output: 15
    }

    // Method to replace an element in an array
    public static void replaceElementInArray() {
        String[] fruits = {"Apple", "Banana", "Orange"};
        fruits[1] = "Mango";  // Replacing "Banana" with "Mango"
        System.out.println("Array after replacement: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }

    // Method to add an element to an array (using ArrayList for dynamic sizing)
    public static void addElementToArray() {
        // Using ArrayList (Array size can't be changed once defined)
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Horse");
        
        // Adding more elements dynamically
        animals.add("Elephant");
        
        System.out.println("ArrayList after adding an element: ");
        for (String animal : animals) {
            System.out.print(animal + " ");
        }
        System.out.println();
    }

    // Method to remove an element from an array (again using ArrayList for simplicity)
    public static void removeElementFromArray() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Removing an element by value
        fruits.remove("Banana");

        // Removing an element by index
        fruits.remove(0);  // Removes "Apple"
        
        System.out.println("ArrayList after removal: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }

    // Method to search for an element in an array
    public static void searchElementInArray() {
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        String searchColor = "Blue";
        boolean found = false;
        for (String color : colors) {
            if (color.equals(searchColor)) {
                found = true;
                break;
            }
        }
        System.out.println("Is '" + searchColor + "' found? " + found);
    }

    // Method to copy one array to another
    public static void copyArray() {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = new int[originalArray.length];

        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        System.out.println("Copied Array: ");
        for (int num : copiedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to sort an array
    public static void sortArray() {
        int[] unsortedArray = {50, 20, 10, 40, 30};
        java.util.Arrays.sort(unsortedArray);
        
        System.out.println("Sorted Array: ");
        for (int num : unsortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to demonstrate multi-dimensional arrays
    public static void multiDimensionalArray() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Multi-dimensional Array (Matrix): ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}

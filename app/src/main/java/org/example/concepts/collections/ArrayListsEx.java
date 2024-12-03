package org.example.concepts.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//arraylist is resizable
//ArrayList can only hold objects (reference types), not primitive types.
public class ArrayListsEx {

    public static void create() {

        // 1 > define fist and add items later
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add(0, "Mazda"); // add to an specific position
        System.out.println(cars);

        // 2 on the go
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

        // using List.Of (cant modify elements later)
        ArrayList<String> cities = new ArrayList<String>(List.of("Gampaha", "colombo"));

        // clone
        ArrayList<String> clonedList = new ArrayList<>(cars);
        System.out.println(clonedList);
    }

    // 2
    public static void manipulations() {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add(0, "Mazda");

        cars.remove(2); // remove an item
        System.out.println(cars);

        System.out.println(cars.get(1)); // access item
        cars.set(1, "new brand"); // change value

        cars.clear(); // remove all
        System.out.println(cars);

        System.out.println(cars.size()); // find how many items in an array

        ArrayList<String> towns = new ArrayList<>(Arrays.asList("ajbk", "fsda", "fsdf"));

        // loop through an array
        for (int i = 0; i < towns.size(); i++) {
            System.out.println(towns.get(i));
        }
        System.out.println("******************");

        // using 'enhance for loop' (for each)
        for (String town : towns) {
            System.out.println(town);
        }

        // list alphabatecally or numerically
        Collections.sort(towns);

    }

    // 3
    public static void demonstrateArrayListFunctions() {

        // Create an ArrayList with initial values
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange", "Grapes"));
        System.out.println("Original List: " + fruits);

        // clone: Create a shallow copy of the ArrayList
        @SuppressWarnings("unchecked")
        ArrayList<String> clonedList = (ArrayList<String>) fruits.clone();
        System.out.println("Cloned List: " + clonedList);

        // contains: Check if a specific item exists in the list
        System.out.println("Contains 'Banana': " + fruits.contains("Banana")); // true
        System.out.println("Contains 'Mango': " + fruits.contains("Mango")); // false

        // addAll: Add all elements from another collection to this list
        fruits.addAll(Arrays.asList("Mango", "Pineapple"));
        System.out.println("After addAll: " + fruits);

        // forEach: Iterate over the list and perform an action on each element
        System.out.print("Using forEach: ");
        fruits.forEach(fruit -> System.out.print(fruit + " "));
        System.out.println();

        // indexOf: Get the index of a specific item
        System.out.println("Index of 'Orange': " + fruits.indexOf("Orange")); // 2

        // isEmpty: Check if the list is empty
        System.out.println("Is the list empty? " + fruits.isEmpty()); // false

        // lastIndexOf: Get the last index of a specific item
        fruits.add("Apple"); // Add duplicate Apple to test lastIndexOf
        System.out.println("Last index of 'Apple': " + fruits.lastIndexOf("Apple")); // 5

        // removeAll: Remove all elements from the list that are contained in another
        // collection
        fruits.removeAll(Arrays.asList("Mango", "Pineapple"));
        System.out.println("After removeAll: " + fruits);

        // replaceAll: Replace all elements of the list with a specific value
        Collections.replaceAll(fruits, "Apple", "Peach");
        System.out.println("After replaceAll: " + fruits);

        // toArray: Convert the list to an array
        Object[] fruitArray = fruits.toArray();
        System.out.print("Array: ");
        for (Object fruit : fruitArray) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // trimToSize: Trim the capacity of the ArrayList to the current size
        // no visible effect, good for reduce memory
        fruits.trimToSize();
        System.out.println("After trimToSize: " + fruits);
    }

}

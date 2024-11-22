package org.example.concepts.collections;

import java.util.Arrays;
import java.util.Collections;

// The number of elements (size) in the array is fixed at the time of creation. Once an array is initialized, its size cannot be changed.

public class NormalArrayEx {

    // 1
    public static void createArray() {

        // array with predefined values
        int[] nums = { 10, 25, 356, 156 };

        // create an empty array and assign values later
        int[] newNums = new int[5];
        newNums[0] = 125;
        newNums[1] = 15;
        newNums[2] = 185;
        newNums[3] = 195;
        newNums[4] = 65;

        // newNums[5] = 525;
        // this will give an ArrayIndexOutOfBoundsException error

        // System.out.println(newNums); this wont print the array, only the memory
        // reference

        //create array using for loops
        int[] newNEwNums =new int[5];
        for(int i = 0; i<newNEwNums.length; i++){
            newNEwNums[i] = 2*i;
        }

        // to print an array as itself >>
        System.out.println(Arrays.toString(newNums));
        System.out.println();
        System.out.println(Arrays.toString(newNEwNums));

        // to loop through array and get values outside
        // 1
        for (int i : newNums) {
            System.out.print(i + " ");
        }

        System.out.println(); // just a space between these 2

        // 2
        for (int i = 0; i < newNums.length; i++) {
            System.out.print(newNums[i] + " ");
        }

        System.out.println(); // just a space between these 2

        // create an array with the same value
        String[] sameNameArray = new String[3];
        Arrays.fill(sameNameArray, "Dinuka");
        System.out.print(Arrays.toString(sameNameArray));
    }

    // 2
    public static void arrayElementManipulations() {

        String[] fruits = { "Apple", "Banana", "Orange" };

        // aceess elements
        System.out.println(fruits[2]);
        // replacing values
        fruits[1] = "Not Banana";
    }

    // 3
    public static void arraySorting() {
        int[] numbers = { 100, -50, 456, 5, -8 };

        // normal sorting (ascending order)
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // advanced sorting (this ex is just descending order, can do more)
        // for non-primitive types
        Integer[] nums = { 100, -50, 456, 5, -8 };
        Arrays.sort(nums, (a, b) -> b - a);
        System.out.println(Arrays.toString(nums));

        // or

        Arrays.sort(nums, Collections.reverseOrder());

        // Strings sorting
        // 1 normal === (dictionary order + Uppercase words first)
        String[] words = { "apple", "AX", "Banana", "cherry", "Apricot", "AA" };
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        // 2 without case sensitivity
        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(words));

        // same with chars and others
        // only the boolens cant sorted because they are non compareble

        // Mixed Arrays cant sorted like normal arrays, must converted to Strings
        Object[] mixedArr = { 10, "apple", 3.14, "banana" };
        Arrays.sort(mixedArr, (a, b) -> a.toString().compareTo(b.toString()));

        // .toString() === 10 becomes "10","banana" remains "banana", then compared with
        // lexicographical order (i.e., alphabetical or numerical order)

        System.out.println(Arrays.toString(mixedArr));

    }

    // 4
    public static void moreSortings() {

        // create an inner class just to demonstrate next array sorting
        class Human {

            String name;
            int age;

            Human(String name, int age) {
                this.name = name;
                this.age = age;
            }

            // Override toString method to get meaningful output
            @Override
            public String toString() {
                return name + " (" + age + ")";
            }
        }

        // crete an array of Human Objects
        Human[] people = {
                new Human("Dinuka", 26),
                new Human("Pramod", 36),
                new Human("BBJohn", 10),
                new Human("AAJohn", 10),
                new Human("cat", 108)
        };

        Arrays.sort(people, (a, b) -> a.age - b.age);
        System.out.println(Arrays.toString(people));

        // 2nd parameter of .sort() can be any logic, even another method
        Arrays.sort(people, (a, b) -> {
            int ageCompare = a.age - b.age;
            // if ages have dif values > sort by age(as usual )
            /// if both ages are equal > sort by name
            return (ageCompare != 0) ? ageCompare : a.name.compareTo(b.name);
        });
        System.out.println(Arrays.toString(people));

        // with binary search (explained in below method)
        int index = Arrays.binarySearch(people, new Human("", 26), (a, b) -> a.age - b.age);
        System.out.println(index);
        System.out.println(people[index]);

    }

    // 5 >>> arrays must be sorted before using .binarySearch()
    public static void arraySearching() {
        int[] nums = { 1, 3, 5, 7, 9 };
        int index = Arrays.binarySearch(nums, 5);
        System.out.println(index); // Output: 2

        // if the key is not found
        int notFoundIndex = Arrays.binarySearch(nums, 4);
        System.out.println(notFoundIndex); // Output: -3

        String[] fruits = { "Apple", "Banana", "Mango", "Peach" };
        Arrays.sort(fruits);
        int indexOfFruits = Arrays.binarySearch(fruits, "Mango");
        System.out.println(indexOfFruits); // Output: 2

    }

    // 6
    // Resizing an Array: You can use Arrays.copyOf() to create a new array with a
    // different size.
    public static void copyArrays() {

        int[] original = { 1, 2, 3, 4, 5 };

        int[] largerCopy = Arrays.copyOf(original, 7);
        System.out.println("Larger Copy: " + Arrays.toString(largerCopy));
        // extra elements will filled with default values (0, false, null)

        int[] smallerCopy = Arrays.copyOf(original, 3);
        System.out.println("Smaller Copy: " + Arrays.toString(smallerCopy));
        // extra elements will truncated

        String[] originalString = { "Apple", "Banana", "Cherry", "Date" };

        // copy the exact array(same for other types too)
        String[] copy = Arrays.copyOf(originalString, originalString.length);
    }

    //7
    // Copies a specific range of elements from one array to another existing array.

    // The destination array must already exist with enough space to accommodate the
    // copied elements.
    public static void usingSystemArrayCopy() {

        // System.arraycopy(Object src, int srcPos, Object dest, int destPos, int
        // length);
        /*
         * src: Source array (the array to copy from).
         * srcPos: Starting index in the source array.
         * dest: Destination array (the array to copy into).
         * destPos: Starting index in the destination array.
         * length: Number of elements to copy.
         */

         int[] original = {10,20,30,40,50};
         int[] copy = new int[7];

         System.arraycopy(original, 2, copy, 3, 2);
         System.out.println(Arrays.toString(copy)); 
         //[0, 0, 0, 30, 40, 0, 0]

    }

    //8
    //Arrays are considered equal only if elements are in the same order
    public static void arrEqualCheck(){

        int[] arrr1  = {1,2,3,4};
        int[] arr2 = {1,2,3,4};

        //this will output true or false
        //same for strings, chars, bools, ...etc
        System.out.println(Arrays.equals(arrr1, arr2));

        //complex logic for Object compariosn...not demonstrated here
    }
    
    

}

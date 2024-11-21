package org.example.concepts.collections;

import java.util.Arrays;

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

        // to print an array as itself >>
        System.out.println(Arrays.toString(newNums));

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
                new Human("Pramod", 66),
                new Human("BBJohn", 10),
                new Human("AAJohn", 10),
                new Human("cat", 108)
        };

        Arrays.sort(people, (a, b) -> a.age - b.age);
        System.out.println(Arrays.toString(people));

        //2nd parameter of .sort() can be any logic, even another method
        Arrays.sort(people , (a,b)-> {
            int ageCompare = a.age - b.age ;
            //if ages have dif values >  sort by age(as usual )
            ///if both ages are equak > sort by name 
            return (ageCompare != 0) ? ageCompare : a.name.compareTo(b.name); 
        });
        System.out.println(Arrays.toString(people));

    }

}

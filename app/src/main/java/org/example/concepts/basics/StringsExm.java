package org.example.concepts.basics;

/*
 * in App >>> StringsExm.stringsExMMethod();
 */

public class StringsExm {

    // since this is static, this can be called in main, without creating an
    // instance of this class
    public static void stringsExMMethod() {

        String txt = "The Quick Brown Fox";
        String txt2 = " Jumps";

        System.out.println("Subjected Text : " + txt);

        // ===================== Example for basic string operations
        // ============================
        System.out.println(txt.length()); // even the white spaces are counted
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("Quick")); // count begins from 0
        System.out.println(txt + txt2);
        System.out.println(txt.concat(txt2)); // same as above
        System.out.println(txt.contains("Brown"));
        System.out.println(txt2.equals("Runs"));

        String specialCharacters = "We are the so-called \"Vikings\" from the north.";

        /*
         * \n New Line
         * \r Carriage Return
         * \t Tab
         * \b Backspace
         * \f Form Feed
         */

        // ================================ Formatting String with String.format
        // ====================
        int age = 25;
        String name = "Dinuka";

        // Using String.format() to format a string
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println(formatted);

        /*
         * %d : Integer
         * %f : Floating-point number
         * %s : String
         * %x : Hexadecimal integer
         * %c : Character
         * %b : Boolean
         * %n : Newline (platform-independent)
         */

        // ================================ Extracting Substrings using getChars
        // ====================
        String str = "Hello, Java!";
        char[] destinationArray = new char[10]; // Array to hold the copied characters

        // Extract characters from index 7 to 11 and copy them to the dest array
        str.getChars(7, 12, destinationArray, 3);

        // Print the resulting character array
        System.out.println(destinationArray); // Output: ___Java___

        // ================================ Example for additional String methods
        // =====================

        // intern()
        String s1 = new String("Hello");
        String s2 = "Hello";
        System.out.println(s1 == s2); // false, as they are different objects
        String s3 = s1.intern(); // Returns the string from the string pool
        System.out.println(s2 == s3); // true, as s3 now refers to the string pool

        // join()
        String joined = String.join(", ", "apple", "banana", "cherry");
        System.out.println(joined); // Output: apple, banana, cherry

        // replace()
        String replaced = txt.replace("Quick", "Fast");
        System.out.println(replaced); // Output: The Fast Brown Fox

        // split()
        String[] words = txt.split(" ");
        for (String word : words) {
            System.out.println(word); // Output: The, Quick, Brown, Fox
        }

        // subSequence()
        CharSequence subSeq = txt.subSequence(4, 9); // Extracts from index 4 to 8 (exclusive of 9)
        System.out.println(subSeq); // Output: Quick

        // substring()
        String subStr = txt.substring(4, 9); // Extracts from index 4 to 8 (exclusive of 9)
        System.out.println(subStr); // Output: Quick

        // trim()
        String txtWithSpaces = "   Hello, World!   ";
        System.out.println(txtWithSpaces.trim()); // Output: "Hello, World!" (leading/trailing spaces removed)

        // valueOf()
        int num = 123;
        String numStr = String.valueOf(num); // Converts int to String
        System.out.println(numStr); // Output: 123
    }
}

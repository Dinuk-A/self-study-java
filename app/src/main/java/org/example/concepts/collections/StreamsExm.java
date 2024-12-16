package org.example.concepts.collections;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.nio.file.Paths;
import java.io.FileReader;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;
import java.io.IOException;

//Streams allow you to perform operations like filtering, mapping, and reducing on data collections
/*
Streams in Java are not data structures; they are pipelines for processing data.

 * Do not store data; work as a pipeline for data.
 * Immutable—do not modify the source.
 * 
 */

/*
 * has 2 types of ops
 * 
 intermediate (  not executed immediately. They are applied only when a terminal operation is called )
 
 terminal (  the end of a stream pipeline , They trigger the execution of all intermediate operations and produce a result )
 */

public class StreamsExm {

    // 1
    public static void createStreams() {

        // from a normal (primitive ) array
        int[] nums = { 1, 2, 3 };
        IntStream intStream = Arrays.stream(nums);
        intStream.forEach(System.out::println);
        System.out.println();

        // from a List
        List<String> names = List.of("fdsf", "dsa", "sfsfd");
        Stream<String> streamFromList = names.stream();
        streamFromList.forEach(System.out::println);
        System.out.println();

        // from a string
        String text = "df dsf34g 65dfgd 5gs";
        Stream<String> textStream = Stream.of(text.split(" "));
        textStream.forEach(System.out::println);
        System.out.println();

        // String.chars() processes each character of the string and converts it into
        // its Unicode code point
        IntStream charStrmuniCodes = text.chars();
        charStrmuniCodes.forEach(System.out::println);
        System.out.println();

        Stream<Character> chars = text.chars().mapToObj(c -> (char) c);
        chars.forEach(System.out::println);
        System.out.println();

        // from files (NIO)
        Path path = Paths.get("MyFolder/file_6.txt");
        try {

            Stream<String> lines = Files.lines(path);
            System.out.println("lines : ");
            lines.forEach(System.out::println);
            System.out.println();

        } catch (IOException e) {
            System.out.println("errorrrrrrr");
        }

        // from files (traditional)
        try {
            BufferedReader reader = new BufferedReader(new FileReader("MyFolder/file_6.txt"));
            Stream<String> lines2 = reader.lines();
            System.out.println("lines 2 : ");
            lines2.forEach(System.out::println);
            System.out.println();
        } catch (IOException e) {
            System.out.println("errorrrrrrr");
        }

    }

    // 2 filters
    public static void filtersWithStream() {

        // 1
        List<String> names = List.of("Alice", "Bob", "Charlie");
        Stream<String> namesStrm = names.stream();
        namesStrm.filter(n -> n.startsWith("A")).forEach(System.out::println);

        System.out.println();

        // 2
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        System.out.println();

        // 3
        List<String> names2 = List.of("Alice", "Bob", "Charlie");
        List<String> filteredNames = names2.stream()
                .filter(name -> name.length() > 3)
                .toList(); // Terminal operation

        // 4
        long count = List.of(1, 2, 3, 4)
                .stream()
                .map(x -> x * 3)
                .filter(x -> x > 5)
                .count(); // Terminal operation
        System.out.println(count);

    }

}
/*
 * Intermediate Stream Operations:
 * - distinct() // Removes duplicates
 * - peek() // Performs a side-effect for each element (e.g., for debugging)
 * - sorted() // Sorts elements in natural or custom order
 * - limit() // Limits the number of elements
 * - skip() // Skips a specified number of elements
 * - flatMap() // Flattens nested collections/streams into a single stream
 * - mapToInt() // Converts the stream to an IntStream (from Object to int)
 * - mapToDouble() // Converts the stream to a DoubleStream (from Object to
 * double)
 * - mapToLong() // Converts the stream to a LongStream (from Object to long)
 * - mapToObj() // Converts primitive streams back to Object streams
 * - anyMatch() // Checks if any element matches a given condition
 * - allMatch() // Checks if all elements match a given condition
 * - noneMatch() // Checks if no elements match a given condition
 * - reduce() // Performs a reduction (combines elements into a single result)
 * 
 * Terminal Stream Operations:
 * - forEach() // Performs an action for each element
 * - collect() // Collects the stream elements into a collection
 * - count() // Returns the number of elements in the stream
 * - findFirst() // Returns the first element from the stream
 * - findAny() // Returns any element from the stream
 * - min() // Returns the minimum element based on a comparator
 * - max() // Returns the maximum element based on a comparator
 * - toArray() // Collects the elements into an array
 * - anyMatch() // Checks if any element matches a given condition
 * - allMatch() // Checks if all elements match a given condition
 * - noneMatch() // Checks if no elements match a given condition
 * - reduce() // Reduces the stream to a single result (e.g., sum, product)
 */

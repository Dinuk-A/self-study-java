package org.example.concepts.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class ReadFiles {

    // 1
    public static void readFiles() {

        String fileName = "MyFolder\\\\file_6.txt";
        // 1 write file
        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write("cat 1" + System.lineSeparator());
            myWriter.write("cat 2" + System.lineSeparator());
            myWriter.write("cat 3" + System.lineSeparator());
            myWriter.write("cat 4");
            myWriter.close();

            System.out.println("wrote done");

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }

        // read the same file
        try {
            File myFile = new File(fileName);

            // call scanner class
            Scanner myScanner = new Scanner(myFile);

            while (myScanner.hasNextLine()) {
                System.out.println(myScanner.nextLine());
            }
            myScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }

    }

    // 2 to write w/o overwriting , use append mode == pass true as 2nd arg in
    // FileWriter()

    // 3 read a given file
    public static void readGivenFile(String fileName) {

        File myFile = new File(fileName);

        try {
            Scanner myReader = new Scanner(myFile);

            if (myFile.length() == 0) {
                while (myReader.hasNextLine()) {
                    System.out.println(myReader.nextLine());
                }
            } else {
                System.out.println("this file is empty");
            }

            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }

    }

    // additional  (same as above) 
    // with early returns
    public static void earlyReturn(String fileName) {

        File myFile = new File(fileName);

        // If the file doesn't exist, print the error and return immediately
        if (!myFile.exists()) {
            System.out.println("Error: File does not exist.");
            return; // Stop execution here, no need to check further
        }

        // If the file is empty, print the message and return immediately
        if (myFile.length() == 0) {
            System.out.println("This file is empty.");
            return; // Stop execution here, no need to read the file
        }

        // If the file exists and is not empty, proceed to read the file
        try (Scanner myReader = new Scanner(myFile)) {
            while (myReader.hasNextLine()) {
                System.out.println(myReader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

}

package org.example.concepts.others;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class FileHandle {

    // 1
    public static void createFileOne() {

        try {

            // a file with this name will be created with parallel to app directory, (with
            // gradle and others)

            // createNewFile() method returns a boolean value: true if the file was
            // successfully created, and false if the file already exists.

            // also try catch is necessary

            File myNewFile = new File("abc.txt");

            if (myNewFile.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("file already exists");
            }

        } catch (IOException e) {
            System.out.println("error");
        }
    }

    // 2
    public static void createInSpecificLocation() {

        File specificLocationFile = new File("C:\\Users\\Dinuka Pramod\\Desktop\\java\\createdByJava.txt");

        try {
            specificLocationFile.createNewFile();
        } catch (IOException e) {
            System.out.println("error");
        }

    }

    // 3
    public static void writeAFile() {

        try {

            // in here we can pass an already exist file name or no exist file name. if non
            // exist it creates too and then writes

            FileWriter myWriter = new FileWriter("abcc.txt");
            myWriter.write("catttttttttttts");

            // closing is important after used
            myWriter.close();

            System.out.println("done");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    // 4
    public static void customFileCreation() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter File Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter File Extension: ");
        String extension = scanner.nextLine();

        File newFile = new File(name + "." + extension);

        try {
            if (newFile.createNewFile()) {
                System.out.println("File created successfully: " + newFile.getName());
            } else {
                System.out.println("File already exists: " + newFile.getName());
            }
        } catch (Exception e) {
            System.out.println("Error creating file: " + e.getMessage());
        } finally {
            scanner.close();
        }
       



       
    }
}

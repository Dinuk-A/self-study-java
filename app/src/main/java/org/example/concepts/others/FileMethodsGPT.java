package org.example.concepts.others;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class FileMethodsGPT {

    // 1 ==== create a folder + files inside it
    public static void createFolder() {

        File folder = new File("MyFolder");

        try {
            // create a folder
            boolean folderStatus = folder.mkdir();
            if (folderStatus) {
                System.out.println("new folder created");

                // create files inside it
                try {

                    for (int i = 1; i <= 5; i++) {
                        File myFile = new File("MyFolder\\file_" + i + ".txt");
                        boolean myFileStatus = myFile.createNewFile();

                        if (myFileStatus) {
                            System.out.println("file " + i + " created succesfully");
                        } else {
                            System.out.println("file " + i + "not created ");
                        }
                    }

                } catch (IOException e) {
                    System.out.println("error crearing files");
                }

            } else {
                System.out.println("folder already exists " + folder.getName());
            }

        } catch (SecurityException e) {
            System.out.println("Security manager prevents creating the directory: " + e.getMessage());
        }

    }

    // 2 = check how many/what files inside that folder
    public static void searchFolderByName(String folderName) {

        File folder = new File(folderName);

        if (folder.exists() && folder.isDirectory()) {
            System.out.println("folder found");

            File[] files = folder.listFiles();

            if (files.length == 0) {
                System.out.println("folder is empty");
            } else {
                System.out.println("total files " + files.length);

                for (File f : files) {
                    if (f.isFile()) {
                        System.out.println("**********");
                        System.out.println("name :" + f.getName());
                        System.out.println("size :" + f.length() + " bytes");
                        System.out.println("is hidden  :" + f.isHidden());
                        System.out.println("can read :" + f.canRead());
                        System.out.println("can write :" + f.canWrite());
                        System.out.println("can run :" + f.canExecute());
                        System.out.println("path :" + f.getPath());
                        System.out.println("abs path :" + f.getAbsolutePath());
                        System.out.println("last edited :" + new Date(f.lastModified()));
                        System.out.println("**********");
                    }
                }
            }

        }
    }

    // 3 === search files or folders in current directory
    public static void listCurrentDirectory() {

        File currentDir = new File(".");
        File[] allFilesOrFolders = currentDir.listFiles();

        if (allFilesOrFolders != null) {

            ArrayList<String> filesList = new ArrayList<>();
            ArrayList<String> foldersList = new ArrayList<>();

            for (File f : allFilesOrFolders) {

                if (f.isFile()) {
                    filesList.add(f.getName());
                    // System.out.println("file :"+f.getName());
                } else if (f.isDirectory() && f.isHidden()) {
                    foldersList.add(f.getName());
                    // System.out.println("folder :"+f.getName());
                }

            }

            System.out.println("files  " + filesList.toString());
            System.out.println("folders  " + foldersList);

        } else {
            System.out.println("nothing to display");
        }
    }
}

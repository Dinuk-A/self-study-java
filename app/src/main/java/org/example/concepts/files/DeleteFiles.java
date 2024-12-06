package org.example.concepts.files;

import java.io.File;


public class DeleteFiles {
    
    public static void DeleteFs() {
        
        File myFile = new File("MyFolder\\file_5.txt");

        boolean deleteStatus = myFile.delete();
        
        if (deleteStatus) {
            System.out.println("Deleted the file: " + myFile.getName());
        } else{
            System.out.println("Failed to delete the file.");
        }
    }
    
    

}

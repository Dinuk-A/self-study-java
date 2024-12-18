package org.example.utils.jsonnnn;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.io.Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;

import java.time.Instant;

public class JsonWriteInFiles {

    // 1 === from classes
    public static void writeFromClasses() {

        ObjectMapper mapper = new ObjectMapper();

        // Enable pretty printing
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        ArrayList<Vehicle> vehiArray = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String brand = "brand_" + i;
            String model = "model_" + i;
            int wheels = 4 * i;

            Vehicle vehicle = new Vehicle(brand, model, wheels);
            vehiArray.add(vehicle);
        }

        try {
            File vehiFile = new File(
                    "D:\\PROJECTS\\JAVA-learn-app\\app\\src\\main\\java\\org\\example\\utils\\jsonnnn\\vehicle.json");

            mapper.writeValue(vehiFile, vehiArray);

            System.out.println("file written successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // 2 write file with metadata (also classes)
    public static void writeWithMetadata() {

        ObjectMapper mapper = new ObjectMapper();

        // Enable pretty printing
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        ArrayList<Vehicle> vehiArray = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String brand = "brand_" + i;
            String model = "model_" + i;
            int wheels = 4 * i;

            Vehicle vehicle = new Vehicle(brand, model, wheels);
            vehiArray.add(vehicle);
        }

        // Create Metadata
        String currentDateTime = Instant.now().toString(); // Get current time
        Metadata metadata = new Metadata("vehicle", currentDateTime);

        // Wrap vehicles data and metadata into a single object
        MetadataWrapper wrapper = new MetadataWrapper(metadata, vehiArray);

        try {
            File vehiFile = new File(
                    "D:\\PROJECTS\\JAVA-learn-app\\app\\src\\main\\java\\org\\example\\utils\\jsonnnn\\vehicle.json");

            // Write the wrapper object (with metadata and vehicles) to file
            mapper.writeValue(vehiFile, wrapper);

            System.out.println("File written successfully with metadata");

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    // 3 === append to an existing file (also classes)
    public static void appendToExsFile() {

        ObjectMapper mapper = new ObjectMapper();

        // Enable pretty printing
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        MetadataWrapper metadataWrapper = null;

        ArrayList<Vehicle> newVehicles = new ArrayList<>();

        for (int i = 3; i < 6; i++) { // Adding new vehicles (brand_3, brand_4, brand_5)
            String brand = "brand_" + i;
            String model = "model_" + i;
            int wheels = 4 * i;
            Vehicle vehicle = new Vehicle(brand, model, wheels);
            newVehicles.add(vehicle);
        }

        try {

            // Read the existing vehicle.json file into the wrapper
            File vehiFile = new File(
                    "D:\\PROJECTS\\JAVA-learn-app\\app\\src\\main\\java\\org\\example\\utils\\jsonnnn\\vehicle.json");

            if (vehiFile.exists()) {

                metadataWrapper = mapper.readValue(vehiFile, MetadataWrapper.class);

                if (metadataWrapper.getMetadata().getType().equals("vehicle")) {

                    List<Vehicle> exsVehis = metadataWrapper.getVehicles();

                    // duplications didnt check here ⚠
                    // create a separate example for that using a more suitable class like Student

                    // append
                    exsVehis.addAll(newVehicles);

                    // Update the metadata with the latest timestamp
                    String currentDateTime = Instant.now().toString();
                    metadataWrapper.getMetadata().setLastUpdated(currentDateTime);
                    // metadataWrapper.getMetadata().setType("vehicle");

                    mapper.writeValue(vehiFile, metadataWrapper);

                    System.out.println("file updated");

                } else {
                    System.out.println("Error: Incorrect type. Expected 'vehicle' but found '"
                            + metadataWrapper.getMetadata().getType() + "'");
                }

            } else {
                System.out.println("File does not exist.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /*
     * duplications check (for a new example like student)
     * for (Vehicle newVehicle : newVehicles) {
     * boolean exists = existingVehicles.stream().anyMatch(
     * existing -> existing.getBrand().equals(newVehicle.getBrand())
     * && existing.getModel().equals(newVehicle.getModel()));
     * if (!exists) {
     * existingVehicles.add(newVehicle);
     * } else {
     * System.out.println("Duplicate found: " + newVehicle);
     * }
     * }
     */

    // ###################################################################

    // 4 write from org.json features
    public static void writeFromJobjAndJArr() {

        // create an empty json array
        JSONArray jsonArray = new JSONArray();

        // create Json objects
        JSONObject p1 = new JSONObject();
        p1.put("name", "dinuka");
        p1.put("age", 27);

        // create another obj for nested JsonObjs
        JSONObject address = new JSONObject();
        address.put("code", 001);
        address.put("city", "col");

        // combine that new object to main obj( address-> person)
        p1.put("address", address);

        // create person 2 and his address
        JSONObject p2 = new JSONObject();
        p2.put("name", "pramod");
        p2.put("age", 25);

        JSONObject address2 = new JSONObject();
        address2.put("code", 002);
        address2.put("city", "col2");

        p2.put("address", address2);

        // add these completed objects to array
        jsonArray.put(p1);
        jsonArray.put(p2);

        File file = new File(
                "D:\\PROJECTS\\JAVA-learn-app\\app\\src\\main\\java\\org\\example\\utils\\jsonnnn\\ppl.json");

        try {

            FileWriter writer = new FileWriter(file);

            writer.write(jsonArray.toString(4));

            writer.close();

            System.out.println("JSON data written to file successfully.");

            System.out.println(jsonArray);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // 5 with metadata
    public static void writeFromJobjAndJArrWithMetadata() {

        // Create an empty JSON array for storing data
        JSONArray jsonArray = new JSONArray();

        // Create metadata as a JSONObject
        JSONObject metadata = new JSONObject();
        metadata.put("type", "people"); // Specify the type of data
        metadata.put("lastUpdated", Instant.now().toString()); // Add the current timestamp

        // Create JSON objects for the people
        JSONObject p1 = new JSONObject();
        p1.put("name", "dinuka");
        p1.put("age", 27);

        // Create address for person 1
        JSONObject address = new JSONObject();
        address.put("code", 001);
        address.put("city", "col");
        p1.put("address", address);

        // Create person 2 and his address
        JSONObject p2 = new JSONObject();
        p2.put("name", "prampd");
        p2.put("age", 25);

        JSONObject address2 = new JSONObject(); // New address for p2
        address2.put("code", 002);
        address2.put("city", "col");
        p2.put("address", address2);

        // Add people objects to the JSON array
        jsonArray.put(p1);
        jsonArray.put(p2);

        // Create a final wrapper object to hold metadata and people data
        JSONObject finalJson = new JSONObject();
        finalJson.put("metadata", metadata); // Add the metadata object
        finalJson.put("people", jsonArray); // Add the people array

        // Specify the file to save the data
        File file = new File(
                "D:\\PROJECTS\\JAVA-learn-app\\app\\src\\main\\java\\org\\example\\utils\\jsonnnn\\ppl_with_metadata.json");

        try {
            // Write the final JSON object (with metadata and people data) to file
            FileWriter writer = new FileWriter(file);
            writer.write(finalJson.toString(4)); // Pretty print with indentation
            writer.close(); // Close the writer to release resources

            System.out.println("JSON data with metadata written to file successfully.");
            System.out.println(finalJson); // Print the final JSON data

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // 6 same as above but append instead of overwriting
    public static void appendFromJobjAndJArrWithMetadata() {

        // Create an empty JSON array for new data
        JSONArray newJsonArray = new JSONArray();

        // Create metadata as a JSONObject for new data
        JSONObject newMetadata = new JSONObject();
        newMetadata.put("type", "people");
        newMetadata.put("lastUpdated", Instant.now().toString());

        // Create JSON objects for new people
        JSONObject p1 = new JSONObject();
        p1.put("name", "dinuka");
        p1.put("age", 27);

        // Create address for person 1
        JSONObject address = new JSONObject();
        address.put("code", 001);
        address.put("city", "col");
        p1.put("address", address);

        // Create person 2 and his address
        JSONObject p2 = new JSONObject();
        p2.put("name", "prampd");
        p2.put("age", 25);

        JSONObject address2 = new JSONObject();
        address2.put("code", 002);
        address2.put("city", "col");
        p2.put("address", address2);

        // Add new people objects to the JSON array
        newJsonArray.put(p1);
        newJsonArray.put(p2);

        // Specify the file to append the data
        File file = new File(
                "D:\\PROJECTS\\JAVA-learn-app\\app\\src\\main\\java\\org\\example\\utils\\jsonnnn\\ppl_with_metadata.json");

        try {
            // Check if the file already exists
            if (file.exists()) {
                // If the file exists, read its existing content
                // String existingContent = new String(Files.readAllBytes(file.toPath()));

                FileInputStream fis = new FileInputStream(file);
                String existingContent = new String(fis.readAllBytes(), StandardCharsets.UTF_8);

                JSONObject existingJson = new JSONObject(existingContent);

                // Get the existing metadata and people array
                JSONObject existingMetadata = existingJson.getJSONObject("metadata");
                JSONArray existingPeople = existingJson.getJSONArray("people");

                // Append new people data to the existing array
                for (int i = 0; i < newJsonArray.length(); i++) {
                    existingPeople.put(newJsonArray.get(i));
                }

                // Update metadata (or keep it as it is)
                existingMetadata.put("lastUpdated", Instant.now().toString());

                // Create the final updated JSON object with the updated metadata and people
                JSONObject updatedJson = new JSONObject();
                updatedJson.put("metadata", existingMetadata);
                updatedJson.put("people", existingPeople);

                fis.close();

                // Write the updated JSON to the file
                try (FileWriter writer = new FileWriter(file)) {
                    writer.write(updatedJson.toString(4)); // Pretty print with indentation
                    System.out.println("JSON data appended to file successfully.");
                }
            } else {
                // If the file doesn't exist, create it and write new content
                JSONObject finalJson = new JSONObject();
                finalJson.put("metadata", newMetadata);
                finalJson.put("people", newJsonArray);

                try (FileWriter writer = new FileWriter(file)) {
                    writer.write(finalJson.toString(4));
                    System.out.println("JSON data written to new file successfully.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

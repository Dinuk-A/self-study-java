package org.example.utils.jsonnnn;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

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

}

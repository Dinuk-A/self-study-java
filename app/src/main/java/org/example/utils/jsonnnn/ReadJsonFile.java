package org.example.utils.jsonnnn;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.File;
import java.util.List;

public class ReadJsonFile {

    // 01
    public static void ReadJsonFileOne() {

        ObjectMapper mapper = new ObjectMapper();

        // This will hold the wrapper with metadata and vehicles
        MetadataWrapper wrapper = null;

        try {

            File vehiFile = new File(
                    "D:\\PROJECTS\\JAVA-learn-app\\app\\src\\main\\java\\org\\example\\utils\\jsonnnn\\vehicle.json");

            wrapper = mapper.readValue(vehiFile, MetadataWrapper.class);

            System.out.println("data read successfully");
            System.out.println();

            // Print the metadata first
            System.out.println("Metadata: ");
            System.out.println("Type: " + wrapper.getMetadata().getType());
            System.out.println("Last Updated: " + wrapper.getMetadata().getLastUpdated());
            System.out.println();

            // Print the vehicle details
            System.out.println("Vehicles:");

            for (Vehicle v : wrapper.getVehicles()) {
                System.out.println(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

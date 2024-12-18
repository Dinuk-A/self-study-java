package org.example.utils.jsonnnn;

import java.util.ArrayList;
import java.util.List;

public class MetadataWrapper {
    private Metadata metadata;
    private ArrayList<Vehicle> vehicles;

    public MetadataWrapper(Metadata metadata, ArrayList<Vehicle> vehicles) {
        this.metadata = metadata;
        this.vehicles = vehicles;
    }

    public MetadataWrapper(){}

    // Getters and setters
    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return "VehicleDataWrapper{" +
                "metadata=" + metadata +
                ", vehicles=" + vehicles +
                '}';
    }

}

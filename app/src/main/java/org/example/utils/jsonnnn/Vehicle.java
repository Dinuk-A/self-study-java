package org.example.utils.jsonnnn;

//to support file creation in java (with classes example)
public class Vehicle {
    private String brand;
    private String model;
    private int wheels;

    // Constructor
    public Vehicle(String brand, String model, int wheels) {
        this.brand = brand;
        this.model = model;
        this.wheels = wheels;
    }

    public Vehicle(){
        
    }

    // Getters and setters (required for Jackson)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}

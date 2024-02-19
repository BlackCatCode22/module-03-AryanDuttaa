package mystuff;

public class MyStuff {
    private String brand;
    private String model;
    private int storage; // in GB
    private boolean isOn;

    // Constructor
    public MyStuff(String brand, String model, int storage) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
        this.isOn = false; // Laptop is off by default
    }

    // Method to turn the laptop on
    public void turnOn() {
        isOn = true;
        System.out.println(brand + " " + model + " is now turned on.");
    }

    // Method to turn the laptop off
    public void turnOff() {
        isOn = false;
        System.out.println(brand + " " + model + " is now turned off.");
    }

    // Method to display laptop details
    public void displayDetails() {
        System.out.println("Laptop Brand: " + brand);
        System.out.println("Laptop Model: " + model);
        System.out.println("Storage Capacity: " + storage + "GB");
        System.out.println("Is Laptop On? " + isOn);
    }
}

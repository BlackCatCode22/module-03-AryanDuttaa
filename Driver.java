package mystuff;

public class Driver {
    public static void main(String[] args) {
        // Creating an instance of MyStuff, which is a Laptop
        MyStuff myLaptop = new MyStuff("Dell", "XPS 15", 512);

        // Display initial state
        myLaptop.displayDetails();

        // Interact with the Laptop object
        myLaptop.turnOn(); // Turn the laptop on
        myLaptop.displayDetails(); // Display details again to see the change

        myLaptop.turnOff(); // Turn the laptop off
        System.out.println(); // Just to add a blank line for readability
        myLaptop.displayDetails(); // Display details one last time
    }
}

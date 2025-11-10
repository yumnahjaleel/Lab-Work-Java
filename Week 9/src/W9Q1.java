// Base class
class Vehicle {
    // Method in base class
    void cost() {
        System.out.println("The cost of the vehicle varies based on the type.");
    }
}

// Derived class Bus
class Bus extends Vehicle {
    // Method specific to Bus
    void display() {
        System.out.println("This is a Bus.");
    }
}

// Derived class Train
class Train extends Vehicle {
    // Method specific to Train
    void display() {
        System.out.println("This is a Train.");
    }
}

// Main class
public class W9Q1 {
    public static void main(String[] args) {
        // Creating object of Bus
        Bus bus = new Bus();
        System.out.println("Bus Details");
        bus.cost();       // calling inherited method
        bus.display();    // calling its own method

        // Creating object of Train
        Train train = new Train();
        System.out.println("Train Details");
        train.cost();     // calling inherited method
        train.display();  // calling its own method
    }
}



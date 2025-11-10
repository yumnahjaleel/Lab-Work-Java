//Create a class Vehicle with a method run().
// Create subclasses Bike and Car that override the run() method.
// In the main() method, use a reference of Vehicle to call run() for objects of Bike and Car.

//Explanation:
//Vehicle is the base class with a run() method.
//Bike and Car are subclasses that override the run() method.
//In main(), the reference type is Vehicle, but it points to different objects (Bike and Car).
//At runtime, Java decides which run() method to call → this is runtime polymorphism.

// Parent class
class Vehicle {
    void run() {
        System.out.println("The vehicle is running");
    }
}

// Child class 1
class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("The bike is running smoothly");
    }
}

// Child class 2
class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("The car is running fast");
    }
}

// Main class
public class W10Q9 {
    public static void main(String[] args) {
        Vehicle v;  // Reference of parent class

        v = new Bike();  // Object of Bike
        v.run();         // Calls Bike's run() method

        v = new Car();   // Object of Car
        v.run();         // Calls Car's run() method
    }
}


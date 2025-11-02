class CAR {
    String model;
    String color;
    double price;

    // Default constructor
    CAR() {
        this("Unknown", "Unknown"); // Calls the two-argument constructor
    }

    // One-argument constructor
    CAR(String model) {
        this(model, "Unknown"); // Calls the two-argument constructor
    }

    // Two-argument constructor
    CAR(String model, String color) {
        this.model = model;
        this.color = color;
        this.price = 0.0; // Default price
    }

    // Setter method for price
    public void setDetails(double price) {
        this.price = price;
    }

    // Getter methods
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    // Display method
    public void display() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }
}

// Main class
public class W8Q6 {
    public static void main(String[] args) {

        // Creating objects using different constructors
        CAR car1 = new CAR();               // Default constructor
        CAR car2 = new CAR("Tesla");        // One-argument constructor
        CAR car3 = new CAR("BMW", "Black"); // Two-argument constructor

        // Setting prices using setter method
        car1.setDetails(20000.0);
        car2.setDetails(55000.0);
        car3.setDetails(75000.0);

        // Display details
        System.out.println("--- Car Details ---");
        car1.display();
        car2.display();
        car3.display();
    }
}


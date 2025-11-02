class Q4FRUIT {
    String colour;
    String taste;
    int price;

    // Default constructor
    Q4FRUIT() {
        colour = "Unknown";
        taste = "Unknown";
        price = 0;
    }

    // One-argument constructor
    Q4FRUIT(String c) {
        colour = c;
        taste = "Unknown";
        price = 0;
    }

    // Two-argument constructor
    Q4FRUIT(String c, String t) {
        colour = c;
        taste = t;
        price = 0;
    }

    // Three-argument constructor
    Q4FRUIT(String c, String t, int p) {
        colour = c;
        taste = t;
        price = p;
    }

    // Method to display details
    void display() {
        System.out.println("Colour: " + colour);
        System.out.println("Taste: " + taste);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }
}

// Main class
public class W8Q4 {
    public static void main(String[] args) {

        // Using default constructor
        FRUIT f1 = new FRUIT();

        // Using one-argument constructor
        Q4FRUIT f2 = new Q4FRUIT("Red");

        // Using two-argument constructor
        Q4FRUIT f3 = new Q4FRUIT("Yellow", "Sweet");

        // Using three-argument constructor
        Q4FRUIT f4 = new Q4FRUIT("Green", "Sour", 50);

        System.out.println("--- Fruit Details ---");
        f1.display();
        f2.display();
        f3.display();
        f4.display();
    }
}


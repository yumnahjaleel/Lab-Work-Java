class Q5FRUIT {
    String colour;
    String taste;
    int price;

    // Default constructor
    Q5FRUIT() {
        this("Unknown", "Unknown", 0); // calls 3-argument constructor
    }

    // One-argument constructor
    Q5FRUIT(String colour) {
        this(colour, "Unknown", 0); // calls 3-argument constructor
    }

    // Two-argument constructor
    Q5FRUIT(String colour, String taste) {
        this(colour, taste, 0); // calls 3-argument constructor
    }

    // Three-argument constructor
    Q5FRUIT(String colour, String taste, int price) {
        this.colour = colour;
        this.taste = taste;
        this.price = price;
    }

    // Method to display fruit details
    void display() {
        System.out.println("Colour: " + colour);
        System.out.println("Taste: " + taste);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }
}

// Main class
public class W8Q5 {
    public static void main(String[] args) {

        // Using different constructors
        Q5FRUIT f1 = new Q5FRUIT();                         // default
        Q5FRUIT f2 = new Q5FRUIT("Red");                    // one argument
        Q5FRUIT f3 = new Q5FRUIT("Yellow", "Sweet");        // two arguments
        Q5FRUIT f4 = new Q5FRUIT("Green", "Sour", 50);      // three arguments

        System.out.println("--- Fruit Details ---");
        f1.display();
        f2.display();
        f3.display();
        f4.display();
    }
}


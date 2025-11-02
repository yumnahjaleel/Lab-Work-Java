class FRUIT {
    String colour;
    String taste;
    int price;

    // Method to display the values of the fruit
    void display() {
        System.out.println("Colour: " + colour);
        System.out.println("Taste: " + taste);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }
}

public class W8Q1 {
    public static void main(String[] args) {
        // Create first object
        FRUIT f1 = new FRUIT();
        f1.colour = "Red";
        f1.taste = "Sweet";
        f1.price = 100;

        // Create second object
        FRUIT f2 = new FRUIT();
        f2.colour = "Yellow";
        f2.taste = "Sour";
        f2.price = 60;

        // Create third object
        FRUIT f3 = new FRUIT();
        f3.colour = "Green";
        f3.taste = "Bitter";
        f3.price = 40;

        // Call display() method for all three objects
        f1.display();
        f2.display();
        f3.display();
    }
}



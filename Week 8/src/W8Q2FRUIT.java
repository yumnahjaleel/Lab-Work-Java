import java.util.Scanner;
class W8Q2FRUIT {
    String colour;
    String taste;
    int price;

    // Method to set the details of the fruit
    void setDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter colour: ");
        colour = sc.nextLine();

        System.out.print("Enter taste: ");
        taste = sc.nextLine();

        System.out.print("Enter price: ");
        price = sc.nextInt();
    }

    // Method to display the details
    void display() {
        System.out.println("Colour: " + colour);
        System.out.println("Taste: " + taste);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }

    // Main method
    public static void main(String[] args) {
        // Create first W8Q2FRUIT object
        W8Q2FRUIT f1 = new W8Q2FRUIT();

        // Set details of the fruit
        f1.setDetails();

        // Display details of the fruit
        System.out.println("\n--- Fruit Details ---");
        f1.display();
    }
}


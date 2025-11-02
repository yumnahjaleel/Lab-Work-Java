import java.util.Scanner;

// Q3FRUIT class
class Q3FRUIT {
    String colour;
    String taste;
    int price;

    // Method to take input from the user
    void setDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter colour: ");
        colour = sc.nextLine();

        System.out.print("Enter taste: ");
        taste = sc.nextLine();

        System.out.print("Enter price: ");
        price = sc.nextInt();
    }

    // Method to display the fruit details
    void display() {
        System.out.println("Colour: " + colour);
        System.out.println("Taste: " + taste);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }
}

// Main class
public class W8Q3 {
    public static void main(String[] args) {
        // Create three objects of Q3FRUIT
        Q3FRUIT F = new Q3FRUIT();
        Q3FRUIT G = new Q3FRUIT();
        Q3FRUIT H = new Q3FRUIT();

        System.out.println("Enter details of Fruit 1:");
        F.setDetails();

        System.out.println("\nEnter details of Fruit 2:");
        G.setDetails();

        System.out.println("\nEnter details of Fruit 3:");
        H.setDetails();

        System.out.println("Fruit Details:");
        F.display();
        G.display();
        H.display();
    }
}



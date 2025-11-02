package week3;
import java.util.Scanner;

public class W3Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input length and breadth
        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        // Calculate area
        double area = length * breadth;

        // Display result
        System.out.println("The area of the rectangle is: " + area);

        sc.close();
    }
}

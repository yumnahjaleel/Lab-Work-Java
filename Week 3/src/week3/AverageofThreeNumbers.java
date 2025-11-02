package week3;

import java.util.Scanner;

public class AverageofThreeNumbers {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter third number: ");
        double c = sc.nextDouble();

        // Calculate average
        double average = (a + b + c) / 3;

        // Display result
        System.out.println("The average of " + a + ", " + b + " and " + c + " is: " + average);

        // Close scanner
        sc.close();
    }
}


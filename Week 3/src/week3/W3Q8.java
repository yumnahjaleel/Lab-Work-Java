package week3;

import java.util.Scanner;

public class W3Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Convert to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display result
        System.out.println(celsius + " °C = " + fahrenheit + " °F");

        sc.close();
    }
}
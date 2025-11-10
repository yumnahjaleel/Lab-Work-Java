//Create a class Shape with overloaded methods area():
//•	area(int side) – calculates area of a square.
//•	area(int length, int breadth) – calculates area of a rectangle.
//•	area(double radius) – calculates area of a circle.

//Key Points:
//Uses method overloading (same method name, different parameters).
//Uses Scanner for input.
//Demonstrates compile-time polymorphism in Java.

import java.util.Scanner;

class Shape {

    // Method to calculate area of a square
    void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    // Method to calculate area of a rectangle
    void area(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    // Method to calculate area of a circle
    void area(double radius) {
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + circleArea);
    }
}

public class W10Q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape s = new Shape();

        System.out.print("Enter side of square: ");
        int side = sc.nextInt();
        s.area(side);

        System.out.print("\nEnter length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();
        s.area(length, breadth);

        System.out.print("\nEnter radius of circle: ");
        double radius = sc.nextDouble();
        s.area(radius);

        sc.close();
    }
}


//Create a class Shape with a method area(). Create two derived classes Rectangle and Circle that extend Shape.
//Each class should override the area() method to calculate the area of the respective shape.
//Create objects of Rectangle and Circle and call their area() methods.

class Shape {
    // Method to be overridden by subclasses
    void area() {
        System.out.println("Area of shape is not defined.");
    }
}

class Rectangle extends Shape {
    double length, width;

    // Constructor
    Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    // Overriding area() method
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double r) {
        this.radius = r;
    }

    // Overriding area() method
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

public class W9Q6 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 3);
        Circle circ = new Circle(4);

        // Calling overridden methods
        rect.area();
        circ.area();
    }
}

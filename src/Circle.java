import java.util.Scanner;

// Circle class
class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter (circumference) of the circle
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
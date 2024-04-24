import java.util.Scanner;

public class Main_Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Creating a circle object with the given radius
        Circle circle = new Circle(radius);

        // Calculating area and perimeter
        double area = circle.calculateArea();
        double perimeter = circle.calculatePerimeter();

        // Printing the results
        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter (circumference) of the circle: " + perimeter);

        scanner.close();
    }
}

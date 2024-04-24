class Shape {
    public double getArea() {
        return 0; // Default implementation, overridden by subclasses
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding getArea() method to calculate area of rectangle
    @Override
    public double getArea() {
        return length * width;
    }
}
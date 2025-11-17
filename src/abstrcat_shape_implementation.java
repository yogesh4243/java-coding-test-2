// Abstract class Shape
abstract class Shape {
    // Abstract method
    abstract double getArea();
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

    // Implement abstract method
    @Override
    double getArea() {
        return length * width;
    }
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement abstract method
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

// Main class to test
public class abstrcat_shape_implementation {
    public static void main(String[] args) {
        // Create objects
        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(4);

        // Print areas
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Circle Area: " + circle.getArea());
    }
}


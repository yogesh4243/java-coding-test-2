// Drawable interface with draw() method
interface Drawable {
    void draw();
}

// Circle2 class implementing Drawable interface
class Circle2 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Rectangle2 class implementing Drawable interface
class Rectangle2 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Main class to test the implementation
public class DrawableTest {
    public static void main(String[] args) {

        // Creating objects
        Drawable circle = new Circle2();
        Drawable rectangle = new Rectangle2();

        // Calling draw() method
        circle.draw();
        rectangle.draw();
    }
}

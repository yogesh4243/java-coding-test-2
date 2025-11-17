// Outer and Inner Class Implementation
class Outer {
    int x = 10;  // Outer class variable

    // Inner class
    class Inner {
        void show() {
            System.out.println("Inner class accessing outer variable: " + x);
        }
    }

    void display() {
        System.out.println("Outer class variable x: " + x);

        // Creating object of Inner class inside Outer class
        Inner innerObj = new Inner();
        innerObj.show();
    }
}

public class outer_and_inner_class_implementation {
    public static void main(String[] args) {
        Outer outerObj = new Outer();
        outerObj.display();
    }
}

